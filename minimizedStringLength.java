public class minimizedStringLength {
    public static void main(String[] ukiyo) {
        new mostWordsFound();
    }

    public minimizedStringLength() {
        exe();
    }

    private void exe() {
        String s = "aaabc";
        System.out.println(minimizedStringLength(s));
    }

    public int minimizedStringLength(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++)
            if (!r.contains("" + s.charAt(i)))
                r += s.charAt(i);
        return r.length();

    }
}
