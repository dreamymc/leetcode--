import java.util.*;

public class novemberNew {
    public static void main(String[] ukiyo) {
        Scanner scan = new Scanner(System.in);
        String sentence = "Hi, I'm still into you. I hope you're doing fine on your life right now, as I am doing fine on mine. I actually still miss you nad dreams of you every night.";
        novemberNewInterface nnn = () -> {
            for (int i = 0; i < sentence.length(); i++) {
                System.out.print(sentence.charAt(i));
                if (sentence.charAt(i) != '.')
                    try {
                        Thread.sleep(40);
                    } catch (Exception e) {
                    }
                else
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
            }
        };
        boolean flag = true;
        while (flag) {
            System.out.println("\n[1] See messages.\n[0] End call.");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    nnn.message();
                    break;
                case 0:
                    System.out.println("Program closed.");
                    flag = false;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }

    }
}