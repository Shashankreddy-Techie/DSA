class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
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

    // Function to search a given key in BST
    public boolean search(int key) {
        return searchRec(root, key);
    }

    // A utility function to search a given key in BST
    boolean searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        // Key is greater than root's key
        if (key > root.data) {
            return searchRec(root.right, key);
        }
        // Key is smaller than root's key
        return searchRec(root.left, key);
    }

    // Function to delete a node with a given key
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    // A utility function to delete a node with a given key
    Node deleteRec(Node root, int key) {
        // Base case: If the tree is empty
        if (root == null) {
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    // A utility function to find the minimum value node in a given tree
    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
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

    // Main method to test the binary search tree
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting nodes into the binary search tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Printing the traversals
        System.out.println("In-order traversal:");
        bst.inorder();

        System.out.println("\nPre-order traversal:");
        bst.preorder();

        System.out.println("\nPost-order traversal
