// import java.util.HashMap;
// import java.util.Map;

class findTheSingle {
    public static void main(String[] ukiyo) {
        int[] nums = { 1, 3, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }



}