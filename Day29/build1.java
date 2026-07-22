class Solution {
    private Map<Integer, Integer> inorderMap = new HashMap<>();
    private int postorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootVal = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = inorderMap.get(rootVal);

        root.right = build(postorder, inorderIndex + 1, right);
        root.left = build(postorder, left, inorderIndex - 1);

        return root;
    }
}