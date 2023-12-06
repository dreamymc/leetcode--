import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 11, 13 };
        int key = 7;

        int index = Arrays.binarySearch(array, key);

        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}