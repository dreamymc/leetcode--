// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]

// Example 2:

// Input: nums = [1], k = 1
// Output: [1]

/*
 * mag buhat og hashmap nga <length sa array(count sa ika pila siya ninggawas), list sa values>
 * then     
 */
import java.util.*;
import java.util.Map.Entry;

public class topkfrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> count = new ArrayList<>(nums.length+1);// i return ang top k most frequent elements sugod sa
                                                                 // length sa list
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (myMap.containsKey(nums[i]))
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
            else
                myMap.put(nums[i], 1);
        for (Entry<Integer, Integer> entry : myMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (count.size() < value)
                count.add(new ArrayList<>());
            count.get(value - 1).add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = count.size() - 1; i >= 0; i--) {
            if (i < count.size() && count.get(i).size() > 0) { // Add a check for the bounds of count
                for (int j = 0; j < count.get(i).size(); j++) {
                    result.add(count.get(i).get(j));
                    if (result.size() == k)
                        break;
                }
            }
            if (result.size() == k)
                break;
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        System.out.println(topKFrequent(nums, k));
    }
}
