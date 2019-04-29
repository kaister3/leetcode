/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//??? why so easy???
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        else {
            return compare(root.left, root.right);
        }
    }

    public boolean compare(TreeNode a, TreeNode b) {
        if(a == null && b == null) {
            return true;
        }
        else if(a == null || b == null) {
            return false;
        }
        else {
            if(a.val == b.val) {
                return compare(a.left, b.right)&&compare(a.right, b.left);
            }
            else {
                return false;
            }
        }
    }
}

