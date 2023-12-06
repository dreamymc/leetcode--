public class isMonotonic {
    public static void main(String[] ukiyo) {
        new isMonotonic();
    }

    public isMonotonic() {
        exe();
    }

    private void exe() {
        System.out.print("Example 1: ");
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(isMonotonic(nums));

        System.out.print("Example 2: ");
        int nums2[] = { 6, 5, 4, 4 };
        System.out.println(isMonotonic(nums));

        System.out.print("Example 3: ");
        int nums3[] = { 1, 3, 2 };
        System.out.println(isMonotonic(nums));
    }

    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i])
                isDecreasing = false;
            else if (nums[i - 1] > nums[i])
                isIncreasing = false;

            if (!isDecreasing && !isIncreasing)
                return false;
        }

        return true;
    }
}
