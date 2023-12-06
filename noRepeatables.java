
import java.util.HashMap;

public class noRepeatables {

    public static void main(String[] args) {
        String word = "I like the music you listen to.";
        System.out.println(lengthOfLongestSubstring(word));

    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int start = 0;
        HashMap<Character, Integer> myMap = new HashMap<>();

        for (int current = 0; current < s.length(); current++) {
            char letter = s.charAt(current);
            if (myMap.containsKey(letter)) {
                start = Math.max(start, myMap.get(letter) + 1);
            }
            myMap.put(letter, current);
            count = Math.max(count, current - start + 1);
        }

        return count;
    }
}
