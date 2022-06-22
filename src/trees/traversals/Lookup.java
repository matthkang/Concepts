package trees.traversals;
/*
Lookup is an o(log(n)) operation because you're eliminating half of the nodes after each iteration.
Running time is equal to the number of times that you can halve n nodes before you get to the value.
If the tree is skewed, then the worst time complexity is O(n).

This is for BST only!
 */

import trees.TreeNode;

public class Lookup {
    // iteratively based on the structure of a binary search tree
    // where the left childs are less than the current nodes val, and right are greater
    public static boolean hasValue(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return true;
            }
            // if our current value is less than what we're looking for...
            // we need to look higher, so to the right
            else if (root.val < val) {
                root = root.right;
            } else if (root.val > val) {
                root = root.left;
            }
        }

        return false;
    }

    // recursively
    public static boolean hasValueRec(TreeNode root, int val) {
        if (root == null){
            System.out.println("value does not exist in BST");
            return false;
        }
        else if (root.val == val){
            System.out.println(val + " does exist in BST");
            return true;
        }


        if (root.val < val){
            return hasValueRec(root.right, val);
        }
        // if (root.val > val)
        else {
            return hasValueRec(root.left, val);
        }
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        head.right.left = new TreeNode(15);
        head.right.right = new TreeNode(7);

        boolean res = hasValueRec(head, 3);
        System.out.println(res);
    }
}