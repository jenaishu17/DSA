package day4;


	// Binary Search Tree Implementation in Java
	class Node {
	    int key;
	    Node left, right;

	    public Node(int item) {
	        key = item;
	        left = right = null;
	    }
	}

	class BST {
	    Node root;

	    // Constructor
	    BST() {
	        root = null;
	    }

	    // Insert a new node
	    void insert(int key) {
	        root = insertRec(root, key);
	    }

	    Node insertRec(Node root, int key) {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }
	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);
	        return root;
	    }

	    // Inorder traversal (Left -> Root -> Right)
	    void inorder() {
	        inorderRec(root);
	    }

	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key + " ");
	            inorderRec(root.right);
	        }
	    }

	    // Search for a value in the BST
	    boolean search(int key) {
	        return searchRec(root, key);
	    }

	    boolean searchRec(Node root, int key) {
	        if (root == null) {
	            return false;
	        }
	        if (root.key == key) {
	            return true;
	        }
	        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
	    }

	   
	}


