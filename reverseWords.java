public class reverseWords {
    public static void main(String[] ukiyo) {
        String input = "a good   example";
        System.out.print(reverseWords(input));
        System.out.println("n");
    }

    public static String reverseWords(String input) {
        input = input.replaceAll("\\s{2,}", " ");
        String s = "";
        for (int i = input.split(" ").length - 1; i >= 0; i--) {
            s += input.split(" ")[i] + " ";
        }
        return s.trim();
    }
}
