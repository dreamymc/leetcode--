public class leetcode1957 {
    public static void main(String[] args) {
        String input = "aaabaaaa";
        System.out.println(makeFancyStringMine(input));
    }

    public static String makeFancyStringMine(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            int length = result.length();
            if (length > 1 && result.charAt(length - 1) == c && result.charAt(length - 2) == c)
                continue;
            result.append(c);
        }
        return result.toString();
    }
}