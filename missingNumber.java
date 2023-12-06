import java.util.*;

public class missingNumber {
    public static void main(String[] ukiyo) {
        new missingNumber();
    }

    public missingNumber() {
        exe();
    }

    private void exe() {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
