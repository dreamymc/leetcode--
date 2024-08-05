import cv2
import dlib
import numpy as np
from tkinter import *
from tkinter import filedialog, messagebox
from PIL import Image, ImageTk

# Load pre-trained face detection and shape predictor models
detector = dlib.get_frontal_face_detector()
predictor = dlib.shape_predictor("shape_predictor_68_face_landmarks.dat")

def get_landmarks(image):
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    rects = detector(gray, 1)
    if len(rects) > 0:
        return np.matrix([[p.x, p.y] for p in predictor(image, rects[0]).parts()])
    return None

def transformation_from_points(points1, points2):
    points1 = points1.astype(np.float64)
    points2 = points2.astype(np.float64)

    c1 = np.mean(points1, axis=0)
    c2 = np.mean(points2, axis=0)
    points1 -= c1
    points2 -= c2

    s1 = np.std(points1)
    s2 = np.std(points2)
    points1 /= s1
    points2 /= s2

    U, S, Vt = np.linalg.svd(points1.T * points2)
    R = (U * Vt).T

    return np.vstack([np.hstack(((s2 / s1) * R, c2.T - (s2 / s1) * R @ c1.T)), np.matrix([0., 0., 1.])])

def warp_image(image, M, dshape):
    output_image = np.zeros(dshape, dtype=image.dtype)
    cv2.warpAffine(image, M[:2], (dshape[1], dshape[0]), dst=output_image, borderMode=cv2.BORDER_TRANSPARENT)
    return output_image

def face_swap(src, dst):
    landmarks1 = get_landmarks(src)
    landmarks2 = get_landmarks(dst)
    if landmarks1 is None or landmarks2 is None:
        return None

    M = transformation_from_points(landmarks1, landmarks2)

    mask = np.zeros(dst.shape, dtype=dst.dtype)
    points = cv2.convexHull(landmarks2)
    cv2.fillConvexPoly(mask, points, (255, 255, 255))

    warped_src = warp_image(src, M, dst.shape)

    combined_image = cv2.seamlessClone(warped_src, dst, mask, (dst.shape[1]//2, dst.shape[0]//2), cv2.NORMAL_CLONE)
    return combined_image

def select_src_image():
    global src_img
    path = filedialog.askopenfilename()
    if path:
        src_img = cv2.imread(path)
        display_image(src_img, src_label)

def select_dst_image():
    global dst_img
    path = filedialog.askopenfilename()
    if path:
        dst_img = cv2.imread(path)
        display_image(dst_img, dst_label)

def display_image(image, label):
    image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
    image = Image.fromarray(image)
    image = ImageTk.PhotoImage(image)
    label.config(image=image)
    label.image = image

def swap_faces():
    if src_img is not None and dst_img is not None:
        result = face_swap(src_img, dst_img)
        if result is not None:
            display_image(result, result_label)
        else:
            messagebox.showerror("Error", "Face swap failed. Make sure both images contain a face.")
    else:
        messagebox.showerror("Error", "Please select both source and destination images.")

src_img = None
dst_img = None

root = Tk()
root.title("Face Swap")

src_btn = Button(root, text="Select Source Image", command=select_src_image)
src_btn.pack()

src_label = Label(root)
src_label.pack()

dst_btn = Button(root, text="Select Destination Image", command=select_dst_image)
dst_btn.pack()

dst_label = Label(root)
dst_label.pack()

swap_btn = Button(root, text="Swap Faces", command=swap_faces)
swap_btn.pack()

result_label = Label(root)
result_label.pack()

root.mainloop()
