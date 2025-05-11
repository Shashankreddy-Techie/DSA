void inorder() {
    inorderRec(root);
}

private void inorderRec(Node root) {
    if (root != null) {
        inorderRec(root.left);  // Visit left subtree
        System.out.print(root.data + " ");  // Visit root
        inorderRec(root.right); // Visit right subtree
    }
}
