package day5;

public class circularaccess {
	public static void main(String[] args) {
        circular_linked list = new circular_linked();

        list.InsertAtBegin(10);
        list.InsertAtBegin(20);
        list.InsertAtBegin(30);
        list.InsertAtBegin(40);

        System.out.println("Circular Linked List:");
        list.display();

        // Insert at any position
        list.insertAtAnyPos(50, 2);
        System.out.println("After inserting 50 at position 2:");
        list.display();

        // Delete at the beginning
        list.deleteAtBegin();
        System.out.println("After deleting at beginning:");
        list.display();

        // Delete at any position
        list.deleteAtAnyPos(3);
        System.out.println("After deleting at position 3:");
        list.display();
    }
}
