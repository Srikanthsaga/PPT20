class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Result {
    int maxSum;

    public Result() {
        this.maxSum = Integer.MIN_VALUE;
    }
}

class Solution {
    public int maxSumSubtree(TreeNode root) {
        Result result = new Result();
        findMaxSum(root, result);
        return result.maxSum;
    }

    private int findMaxSum(TreeNode node, Result result) {
        if (node == null) {
            return 0;
        }

        int leftSum = findMaxSum(node.left, result);
        int rightSum = findMaxSum(node.right, result);

        int subtreeSum = node.val + leftSum + rightSum;
        result.maxSum = Math.max(result.maxSum, subtreeSum);

        return subtreeSum;
    }
}
