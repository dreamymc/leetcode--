import java.util.*;

public class leetcode347 {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        for (int i : topKFrequent(nums, k)) {
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (myMap.containsKey(nums[i]))
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            else
                myMap.put(nums[i], 1);
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(myMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        int res[] = new int[k];
        for (int j = 0; j < k; j++)
            res[j] = list.get(j).getKey();
        return res;
    }
}
