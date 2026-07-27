class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int currentSum) {
        if (root == null) {
            return 0;
        }

        currentSum = currentSum * 10 + root.val;

        if (root.left == null && root.right == null) {
            return currentSum;
        }

        return dfs(root.left, currentSum) +
                dfs(root.right, currentSum);
    }
}