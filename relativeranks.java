
import java.util.*;
import java.util.Map.Entry;

public class relativeranks {
    public static void main(String[] args) {
        int score[] = { 0};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer, String> m = new HashMap<>();
        String[] r = new String[score.length];
        int[] order = Arrays.copyOf(score, score.length);
        int l = score.length;
        Arrays.sort(order);
        m.put(order[l - 1], "Gold Medal");
        if (l >1) 
            m.put(order[l - 2], "Silver Medal");
        if (l >2) 
            m.put(order[l - 3], "Bronze Medal");
    

        for (int i = 0; i < l - 3; i++)
            m.put(order[i], "" + (l - i));
        for (int i = 0; i < l; i++)
            r[i] = m.get(score[i]);
        return r;
    }

}
