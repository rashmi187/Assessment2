package mod13;

class NodeDelete {
    int data;
    NodeDelete left, right;

    NodeDelete(int val) {
        data = val;
        left = right = null;
    }
}

public class BSTDelete {

    static NodeDelete insert(NodeDelete root, int key) {
        if (root == null) return new NodeDelete(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    static NodeDelete minValueNode(NodeDelete node) {
        NodeDelete current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    static NodeDelete deleteNode(NodeDelete root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) return null;

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            NodeDelete temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }

        return root;
    }

    static void inorder(NodeDelete root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        NodeDelete root = null;
        int[] arr = {10, 5, 20, 3, 7, 15, 30};

        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.println("Before deletion:");
        inorder(root);

        int key = 20;
        root = deleteNode(root, key);

        System.out.println("\nAfter deleting " + key + ":");
        inorder(root);
    }
}
