import java.util.*;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] input1 = { 1, 2, 3, 1 };
        containsDuplicate(input1);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == nums[i + 1])
                return true;

        return false;
    }
}
