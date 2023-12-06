import java.util.*;
public class someOtherAlgo {
    public static void main(String[] ukiyo){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
        public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> theList = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j<nums.length; j++){
                for(List x : theList)
                if(nums[j] == nums[i]){
                    temp.add(nums[j]);
                } else if (nums[j] != nums[i]){
                    temp.add(nums[j]);
                }
            }
            theList.add(temp);
        }
        return theList;
    }
}
