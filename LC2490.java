public class LC2490 {
    public static void main(String[] args) {
        new LC2490();

    }

    public LC2490() {
        exe();
    }

    private void exe() {// main syntax to run here
        String sentence = "MuFoevIXCZzrpXeRmTssj lYSW U jM";
        System.out.println(isCircularSentence(sentence));
    }

    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
            return false;
        for (int i = 0; i < words.length - 1; i++)
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0))
                return false;
        return true;
    }
}
