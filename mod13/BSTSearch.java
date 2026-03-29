package mod13;

class NodeSearch {
    int data;
    NodeSearch left, right;

    NodeSearch(int val) {
        data = val;
        left = right = null;
    }
}

public class BSTSearch {

    static NodeSearch insert(NodeSearch root, int key) {
        if (root == null) return new NodeSearch(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    static boolean search(NodeSearch root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;
        else if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    public static void main(String[] args) {

        NodeSearch root = null;
        int[] arr = {10, 5, 20, 3, 7, 15};

        for (int x : arr) {
            root = insert(root, x);
        }

        int key = 15;
        System.out.println("Key " + key + " found? " + search(root, key));
    }
}

