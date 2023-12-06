public class singleNumber {
    public static void main(String[] ukiyo) {
        int[] arr = {4, 4, 2, 3, 3, 1, 1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
            System.out.println("index " + i + " " +result);
        }
        return result;
    }
}
