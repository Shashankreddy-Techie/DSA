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

    // Method to insert a new node
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // A utility method to insert a new node with given data
    private Node insertRec(Node root, int data) {
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

    // Method for in-order traversal
    void inorder() {
        inorderRec(root);
    }

    // A utility method for in-order traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Method for pre-order traversal
    void preorder() {
        preorderRec(root);
    }

    // A utility method for pre-order traversal
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Method for post-order traversal
    void postorder() {
        postorderRec(root);
    }

    // A utility method for post-order traversal
    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Method to search for a value
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // A utility method to search for a value
    private boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.println("In-order traversal:");
        tree.inorder();

        // Print pre-order traversal
        System.out.println("\nPre-order traversal:");
        tree.preorder();

        // Print post-order traversal
        System.out.println("\nPost-order traversal:");
        tree.postorder();

        // Search for a value
        int searchValue = 40;
        System.out.println("\nSearching for " + searchValue + ": " + tree.search(searchValue));
    }
}
