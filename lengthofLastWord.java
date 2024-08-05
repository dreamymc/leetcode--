import java.util.Scanner;
public class lengthofLastWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "   fly me   to   the moon  ";
        System.out.println("Answer is: " + length(s));
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: " + (name));
    }

    private static int length(String s) {
        String trimmed = s.replaceAll("\\s+", " ");
        String[] array = trimmed.split(" ");
        return array[array.length - 1].length();
    }
}
