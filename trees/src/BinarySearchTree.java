import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class BinaryTree {
        //initializing index variable to iterate
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            //increasing index id
            idx++;
            //if node at particular index is -1 which means there is null value present over there
            if (nodes[idx] == -1) {
                return null;
            }
            //Generating new Node
            Node newNode = new Node(nodes[idx]);
            //Getting the left nodes first;
            newNode.leftNode = buildTree(nodes);
            //Getting the right nodes next;
            newNode.rightNode = buildTree(nodes);
            //returning the root node
            return newNode;

        }
    }

    public static void preOrder(Node node) {
        //Time complexity : O(N)
        if (node == null) {
            return;
        }
        System.out.println("PreOrder Root data: " + node.data);
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }

    public static void inOrder(Node node) {
        //Time complexity : O(N)
        if (node == null) {
            return;
        }
        inOrder(node.leftNode);
        System.out.println("Inorder Root data: " + node.data);
        inOrder(node.rightNode);
    }

    public static void postOrder(Node node) {
        //Time complexity : O(N)
        if (node == null) {
            return;
        }
        postOrder(node.leftNode);
        System.out.println("PostOrder Root data: " + node.data);
        postOrder(node.rightNode);
    }

    public static void levelOrder(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);//to indicate next line
        while (!queue.isEmpty()) {
            Node currNde = queue.remove();
            if (currNde == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.println("Level order data: " + currNde.data);
                if (currNde.leftNode != null) {
                    queue.add(currNde.leftNode);
                }
                if (currNde.rightNode != null) {
                    queue.add(currNde.rightNode);
                }
            }


        }
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = binaryTree.buildTree(nodes);
        System.out.println("Root Node data: " + rootNode.data);
        System.out.println("Root node Left node: " + rootNode.leftNode);
        System.out.println("Root node right node: " + rootNode.rightNode);
        preOrder(rootNode);
        inOrder(rootNode);
        levelOrder(rootNode);
    }
}
