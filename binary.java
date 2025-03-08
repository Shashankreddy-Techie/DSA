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
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // A utility function to insert a new node with given data
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Function for in-order traversal
    void inorder() {
        inorderRec(root);
    }

    // A utility function for in-order traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Function for pre-order traversal
    void preorder() {
        preorderRec(root);
    }

    // A utility function for pre-order traversal
    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Function for post-order traversal
    void postorder() {
        postorderRec(root);
    }

    // A utility function for post-order traversal
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Main method to test the binary tree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Printing the traversals
        System.out.println("In-order traversal:");
        tree.inorder();

        System.out.println("\nPre-order traversal:");
        tree.preorder();

        System.out.println("\nPost-order traversal:");
        tree.postorder();
    }
}
