class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Function to insert a new node with given data
    public Node insert(Node node, int data) {
        // If the tree is empty, return a new node
        if (node == null) {
            return new Node(data);
        }

        // Otherwise, recur down the tree
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        // return the unchanged node pointer
        return node;
    }

    // In-order traversal
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // Pre-order traversal
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Post-order traversal
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Wrapper methods for traversals
    void inOrder() {
        inOrder(root);
    }

    void preOrder() {
        preOrder(root);
    }

    void postOrder() {
        postOrder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes into the binary tree
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Print the traversals of the binary tree
        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println("\nPre-order traversal:");
        tree.preOrder();
        System.out.println("\nPost-order traversal:");
        tree.postOrder();
    }
}
