import java.util.Stack;

public class find1321Pattern {
    public static void main(String[] ukiyo) {
        new find1321Pattern();
    }

    public find1321Pattern() {
        exe();
    }

    private void exe() {
        // j is greater than i and j is less than k
        // i < j < k
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(find132pattern(nums));

    }

    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int[] min_i = new int[n];
        min_i[0] = nums[0];
        for (int i = 1; i < n; i++) {
            min_i[i] = Math.min(min_i[i - 1], nums[i]);
        }
        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > min_i[j]) {
                while (!stack.isEmpty() && stack.peek() <= min_i[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }
        return false;

    }
}
