import java.util.ArrayList;
import java.util.List;

public class leetcode3133 {
    public static void main(String[] args) {
        System.out.println(minEnd(3, 4));
    }

    public static long minEnd(int n, long x) {
        List<Long> nums = new ArrayList<>();
        nums.add(x);
        long current = x + 1;
        while (nums.size() < n) {
            long originalNumber = x;
            for (long num : nums)
                originalNumber &= num;
            originalNumber &= current;
            if (originalNumber == x)
                nums.add(current);
            current++;
        }
        return nums.get(nums.size() - 1);
    }
}
