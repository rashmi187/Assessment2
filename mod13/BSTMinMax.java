package mod13;

class NodeMinMax {
    int data;
    NodeMinMax left, right;

    NodeMinMax(int val) {
        data = val;
        left = right = null;
    }
}

public class BSTMinMax {

    static NodeMinMax insert(NodeMinMax root, int key) {
        if (root == null) return new NodeMinMax(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    static int findMin(NodeMinMax root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    static int findMax(NodeMinMax root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {

        NodeMinMax root = null;
        int[] arr = {10, 5, 20, 3, 7, 15, 30};

        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.println("Minimum element: " + findMin(root));
        System.out.println("Maximum element: " + findMax(root));
    }
}
