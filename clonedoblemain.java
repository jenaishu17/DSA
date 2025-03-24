package day4;

public class clonedoblemain {
	
	    public static void main(String[] args) {
	    	Clone_DoublyLinkedList list = new Clone_DoublyLinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);
	        list.insert(50);
	        

	        System.out.println("Original List:");
	        list.display();

	        Clone_DoublyLinkedList clonedList = list.cloneList();
	        System.out.println("Cloned List:");
	        clonedList.display();
	    }
	}

