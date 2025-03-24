package day4;



public class main_class_qs {
	 public static void main(String[] args) {
	        BST tree = new BST();

	        // Insert nodes
	        tree.insert(50);
	        tree.insert(30);
	        tree.insert(70);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(60);
	        tree.insert(80);

	        // Print inorder traversal
	        System.out.println("Inorder traversal:");
	        tree.inorder(); // Output: 20 30 40 50 60 70 80

	        // Search for a value
	        int key = 40;
	        if (tree.search(key))
	            System.out.println("\nKey " + key + " found in BST.");
	        else
	            System.out.println("\nKey " + key + " not found in BST.");
	    }

}
