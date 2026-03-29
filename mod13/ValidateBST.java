package mod13;

class NodeValidate {
    int data;
    NodeValidate left, right;

    NodeValidate(int val) {
        data = val;
        left = right = null;
    }
}

public class ValidateBST {

    static boolean isValidBST(NodeValidate root, long min, long max) {

        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isValidBST(root.left, min, root.data) &&
                isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        NodeValidate root = new NodeValidate(10);
        root.left = new NodeValidate(5);
        root.right = new NodeValidate(20);
        root.left.left = new NodeValidate(3);
        root.left.right = new NodeValidate(7);

        System.out.println("Is Valid BST? " +
                isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
