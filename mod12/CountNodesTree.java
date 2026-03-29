package mod12;

class NodeCount {
    int data;
    NodeCount left, right;

    NodeCount(int val) {
        data = val;
        left = right = null;
    }
}

public class CountNodesTree {

    static int countNodes(NodeCount root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {

        NodeCount root = new NodeCount(10);
        root.left = new NodeCount(5);
        root.right = new NodeCount(20);
        root.left.left = new NodeCount(3);
        root.left.right = new NodeCount(7);

        System.out.println("Total Nodes: " + countNodes(root));
    }
}
