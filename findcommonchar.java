import java.util.Arrays;
import java.util.List;

public class findcommonchar {
    public static List<String> commonChars(String[] words) {
        for (int i = 0; i < words.length; i++)
            words[i] = sortStringAscending(words[i]);
        

        return null;

    }

    public static String sortStringAscending(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String[] words = { "bella", "label", "roller" };
        System.out.println(commonChars(words));
    }
}
