public class mostWordsFound {
    public static void main(String[] ukiyo) {
        new mostWordsFound();
    }

    public mostWordsFound() {
        exe();
    }

    private void exe() {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(mostWordsFound(sentences));
        String[] sentence = { "please wait", "continue to fight", "continue to win" };
        System.out.println(mostWordsFound(sentence));
    }

    public int mostWordsFound(String[] sentences) {
        int maxDiff = Integer.MIN_VALUE;
        for (String each : sentences) {
            String split[] = each.split(" ");
            int diff = split.length;
            if (diff > maxDiff)
                maxDiff = diff;

        }
        return maxDiff;
    }

}
