package Code.Tree.PostOrder;

import Code.Tree.Node;

public class PostOrder {
    public static void main(String[] args)
    {

        Node root = buildTree();
        postOrderTraversal(root);

    }

    public static void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);

        System.out.println("Node Processed: "+root.data);
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
