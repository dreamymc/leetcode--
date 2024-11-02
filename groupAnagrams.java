import java.util.*;

public class groupAnagrams {
    public static void main(String[] ukiyo) {
        new groupAnagrams();
    }

    public groupAnagrams() {
        exe();
    }

    private void exe() {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> myMap = new HashMap<>();
        for (String each : strs) {
            char[] charArr = each.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if (!myMap.containsKey(sorted))
                myMap.put(sorted, new ArrayList<>());
            myMap.get(sorted).add(each);
        }
        return new ArrayList<>(myMap.values());
    }
}