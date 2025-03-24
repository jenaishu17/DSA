package day4;

public class Clone_DoublyLinkedList {
	Node head;
	class Node {
	    int data;
	    Node next, prev;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	
	    

	    // Insert at the end
	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    // Cloning the doubly linked list
	    Clone_DoublyLinkedList cloneList() {
	        if (head == null) return null;

	        // Step 1: Insert cloned nodes next to original nodes
	        Node temp = head;
	        while (temp != null) {
	            Node copy = new Node(temp.data);
	            copy.next = temp.next;
	            temp.next = copy;
	            copy.prev = temp;
	            temp = copy.next;
	        }

	        // Step 2: Adjust the prev pointers of new nodes
	        temp = head;
	        while (temp != null) {
	            if (temp.next != null) {
	                temp.next.prev = (temp.prev != null) ? temp.prev.next : null;
	            }
	            temp = temp.next.next; // Move to the next original node
	        }

	        // Step 3: Separate original and cloned list
	        temp = head;
	        Clone_DoublyLinkedList clonedList = new Clone_DoublyLinkedList();
	        clonedList.head = head.next;
	        Node copy = clonedList.head;

	        while (temp != null) {
	            temp.next = copy.next;
	            temp = temp.next;
	            if (temp != null) {
	                copy.next = temp.next;
	                copy = copy.next;
	            }
	        }
	        return clonedList;
	    }

	    // Display the list
	    void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + "   ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	}

	
	

