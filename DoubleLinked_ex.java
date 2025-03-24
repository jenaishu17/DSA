package day4;

public class DoubleLinked_ex {

	    Node head;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int val) {
	            data = val;
	            next = null;
	            prev = null;
	        }
	    }

	    public DoubleLinked_ex() {
	        head = null;
	    }
	    public void doubleInsertAtBegin(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            newNode.next = temp;
	            temp.prev = newNode; 
	            head = newNode; 
	        }
	    }
	    public void display() {
	        Node temp = head;
	        
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	    public void doubleInsertAtAnyPos(int pos, int val) {
	        Node newNode = new Node(val);
	        Node temp = head;
	        for (int i = 1; i < pos - 1; i++) {
	            temp = temp.next;
	            
	        }
	        newNode.next = temp.next; 
	        if (temp.next != null) {
	            temp.next.prev = newNode; 
	        }
	        temp.next = newNode; 
	        newNode.prev = temp; 
	    }
	    public void doubleDeleteAtBegin() {
	        
	        head = head.next; 
	        if (head != null) {
	            head.prev = null; 
	        }
	    }
	    public void doubleDeleteAtAnyPos(int dpos) {
	        
	        Node temp = head;
	        for (int i = 1; i < dpos; i++) {
	            
	            temp = temp.next;
	        }

	        if (temp.prev == null) {
	            head = temp.next;
	            if (head != null) {
	                head.prev = null; 
	            }
	        } else {
	            temp.prev.next = temp.next; 
	            if (temp.next != null) {
	                temp.next.prev = temp.prev; 
	            }
	        }
	    }

	    	}



