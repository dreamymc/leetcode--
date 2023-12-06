import java.util.ArrayList;
import java.util.List;

public class asd {
    public static void main(String[] ukiyo) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElements(nums));
    }

    public static List<Integer> majorityElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
    
        if (nums == null || nums.length == 0) {
            return result;
        }
    
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
    
        // First pass: Find potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
    
        // Second pass: Count the occurrences of the potential candidates
        count1 = 0;
        count2 = 0;
    
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
    
        // Check if candidates meet the criteria and add to the result
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }
    
        return result;
    }
}