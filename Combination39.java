import java.util.*;

public class Combination39 {
    public static void main(String[] ukiyo) {
        new Combination39();
    }

    public Combination39() {
        execute();
    }

    private void execute() {
        int[] ex1 = { 2, 3, 6, 7 };
        System.out.println("Example 1: " + combinationSum(ex1, 7));
        int[] ex2 = { 2, 3, 5 };
        System.out.println("Example 2: " + combinationSum(ex2, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        // Call the recursive function to find combinations that sum up to the target
        combinationSum(0, candidates, target, new ArrayList<>(), res);

        return res;
    }

    // This is a recursive function that explores all possible combinations
    // of elements from the 'candidates' array to sum up to the 'target'.
    private void combinationSum(int i, int[] candidates, int target, List<Integer> comb,
            List<List<Integer>> res) {
        // If the target becomes 0, it means we have found a valid combination.
        if (target == 0) {
            // Add a copy of the current combination to the result list.
            res.add(new ArrayList<>(comb));
            return;
        }

        // Iterate through the 'candidates' array starting from index 'i'.
        for (int j = i; j < candidates.length; j++) {
            // If the current candidate is greater than the remaining target,
            // skip it as it won't lead to a valid combination.
            if (candidates[j] > target)
                continue;

            // Include the current candidate in the combination.
            comb.add(candidates[j]);

            // Recursively call the function with the updated target and combination.
            combinationSum(j, candidates, target - candidates[j], comb, res);

            // Backtrack by removing the last added candidate to explore other
            // possibilities.
            comb.remove(comb.size() - 1);
        }
    }

}
