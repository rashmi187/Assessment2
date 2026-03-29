package mod13;
class NodeInsert {
    int data;
    NodeInsert left, right;

    NodeInsert(int val) {
        data = val;
        left = right = null;
    }
}

public class BSTInsert {

    static NodeInsert insert(NodeInsert root, int key) {
        if (root == null) return new NodeInsert(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    static void inorder(NodeInsert root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        NodeInsert root = null;
        int[] arr = {10, 5, 20, 3, 7, 15};

        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.println("BST Inorder after insertion:");
        inorder(root);
    }
}
