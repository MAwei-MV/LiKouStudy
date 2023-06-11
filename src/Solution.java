
public class Solution {
    public int rob(TreeNode root) {
        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }

    public int[] helper(TreeNode root) {
        //res[0]表示不偷，res[1]表示偷
        int res[] = new int[2];
        if (root == null) return res;
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        //root不偷
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        //root偷
        res[1] = root.val + left[0] + right[0];
        return res;
    }
}
