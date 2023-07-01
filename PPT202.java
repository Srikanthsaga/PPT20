class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BSTConstructor {
    public Node constructBST(int[] levelOrder) {
        if (levelOrder == null || levelOrder.length == 0) {
            return null;
        }

        Node root = new Node(levelOrder[0]);

        for (int i = 1; i < levelOrder.length; i++) {
            insertNode(root, levelOrder[i]);
        }

        return root;
    }

    private void insertNode(Node root, int value) {
        if (value <= root.value) {
            if (root.left == null) {
                root.left = new Node(value);
            } else {
                insertNode(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(value);
            } else {
                insertNode(root.right, value);
            }
        }
    }
}
