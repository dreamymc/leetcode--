public class leetcode796 {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}
