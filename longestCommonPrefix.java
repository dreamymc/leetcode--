public class longestCommonPrefix {
    public static void main(String[] ukiyo) {
        new longestCommonPrefix();
    }

    public longestCommonPrefix() {
        exe();
    }

    private void exe() {
        String strs[] = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
        String strs2[] = { "flower", "flower", "flower", "flower" };
        System.out.println(longestCommonPrefix(strs2));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty())
                    return "";
            }
        }
        return result;
    }

}
