package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> getPermutations(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        helper(permutations, new ArrayList<>(), nums);

        return permutations;
    }

    public static void helper(List<List<Integer>> res, List<Integer> perm, int[] nums) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (perm.contains(nums[i])) {
                    continue;
                }
                perm.add(nums[i]);
                helper(res, perm, nums);
                perm.remove(perm.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(getPermutations(nums));
    }
}
