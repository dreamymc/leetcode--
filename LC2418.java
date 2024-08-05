import java.util.*;

public class LC2418 {
    public static void main(String[] args) {
        String names[] = { "Mary", "John", "Emma" };
        int heights[] = { 180, 165, 170 };
        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] sortedValues = new String[map.size()];
        int j = 0;
        for (int i = map.size() - 1; i >= 0; i--) {
            sortedValues[j] = map.get(heights[i]);
            j++;
        }

        return sortedValues;
    }
}
