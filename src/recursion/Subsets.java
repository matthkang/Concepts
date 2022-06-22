package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> getPermutations(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums, 0);

        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> set, int[] nums, int start){
        res.add(new ArrayList<>(set));

        for (int i = start; i < nums.length; i++){
            set.add(nums[i]);
            helper(res, set, nums, i + 1);
            set.remove(set.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(getPermutations(nums));
    }
}
