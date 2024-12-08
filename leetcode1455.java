public class leetcode1455 {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("hellohello hellohellohello", "ell"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] string = sentence.split(" ");
        for (int i = 0; i < string.length; i++)
            if (string[i].contains(searchWord))
                return i+1;
        return -1;
    }
}
