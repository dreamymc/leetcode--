import java.util.Scanner;

public class reverseWords3 {
    public static void main(String[] ukiyo) {
        new reverseWords3();
    }

    public reverseWords3() {
        exe();
    }

    private void exe() {
        Scanner scan = new Scanner(System.in);

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
        scan.close();
    }

    public String reverseWords(String s) {

        String[] array = s.split(" ");
        String res = "";
        for (String each : array) {
            StringBuilder sb = new StringBuilder(each);
            res += sb.reverse() + " ";
        }
        return res.replaceAll("\\s+$", "");
    }
}
