package mod12;

class NodePostorder {
    int data;
    NodePostorder left, right;

    NodePostorder(int val) {
        data = val;
        left = right = null;
    }
}

public class PostorderTraversal {

    static void postorder(NodePostorder root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        NodePostorder root = new NodePostorder(10);
        root.left = new NodePostorder(5);
        root.right = new NodePostorder(20);
        root.left.left = new NodePostorder(3);
        root.left.right = new NodePostorder(7);

        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}
