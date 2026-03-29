package mod12;

class NodeInorder {
    int data;
    NodeInorder left, right;

    NodeInorder(int val) {
        data = val;
        left = right = null;
    }
}

public class InorderTraversal {

    static void inorder(NodeInorder root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        NodeInorder root = new NodeInorder(10);
        root.left = new NodeInorder(5);
        root.right = new NodeInorder(20);
        root.left.left = new NodeInorder(3);
        root.left.right = new NodeInorder(7);

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}

