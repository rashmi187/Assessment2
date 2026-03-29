package mod12;


class NodePreorder {
    int data;
    NodePreorder left, right;

    NodePreorder(int val) {
        data = val;
        left = right = null;
    }
}

public class PreorderTraversal {

    static void preorder(NodePreorder root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        NodePreorder root = new NodePreorder(10);
        root.left = new NodePreorder(5);
        root.right = new NodePreorder(20);
        root.left.left = new NodePreorder(3);
        root.left.right = new NodePreorder(7);

        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}

