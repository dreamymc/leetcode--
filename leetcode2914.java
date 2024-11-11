public class leetcode2914 {
    public static void main(String[] args) {
        System.out.println(minChanges("0000"));
    }

    public static int minChanges(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i += 2) 
            if (s.charAt(i + 1) != s.charAt(i))
                result++;
        return result;
    }
}