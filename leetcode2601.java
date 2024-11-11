public class leetcode2601 {
    public static void main(String[] args) {
        System.out.println(primeSubOperation(new int[] { 4, 9, 6, 10 }));
    }

    public static boolean primeSubOperation(int[] nums) {
        boolean result = true;
        for (int i = 1; i < nums.length; i++)
            if (i < i - 1)
                continue;
        
        return result;
    }
}
