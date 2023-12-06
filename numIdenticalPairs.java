public class numIdenticalPairs {
    public static void main(String[] ukiyo) {
        new numIdenticalPairs();
    }

    public numIdenticalPairs() {
        exe();
    }

    private void exe() {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for(int i = 0; i<nums.length; i++)
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j)
                res++;
            }
            return res;
    }
}
