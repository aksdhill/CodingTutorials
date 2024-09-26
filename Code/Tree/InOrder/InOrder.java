package Code.Tree.InOrder;

import Code.Tree.Node;

public class InOrder {
    public static void main(String[] args)
    {
        Node root = buildTree();
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        inOrderTraversal(root.leftNode);
        System.out.println("Node Processed: "+root.data);

        inOrderTraversal(root.rightNode);
    }

    public static Node buildTree() {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);

        root.leftNode = left;
        root.rightNode = right;

        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);
        
        return root;
    }
}
