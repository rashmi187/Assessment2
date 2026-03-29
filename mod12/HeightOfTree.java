package mod12;

class NodeHeight {
    int data;
    NodeHeight left, right;

    NodeHeight(int val) {
        data = val;
        left = right = null;
    }
}

public class HeightOfTree {

    static int height(NodeHeight root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

        NodeHeight root = new NodeHeight(10);
        root.left = new NodeHeight(5);
        root.right = new NodeHeight(20);
        root.left.left = new NodeHeight(3);

        System.out.println("Height of Tree: " + height(root));
    }
}
