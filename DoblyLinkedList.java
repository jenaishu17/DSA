package day4;

public class DoblyLinkedList {
	public static void main(String args[]) {
		DoubleLinked_ex l=new DoubleLinked_ex();
		l.doubleInsertAtBegin(60);
		l.doubleInsertAtBegin(50);
		l.doubleInsertAtBegin(40);
		l.doubleInsertAtBegin(30);
		l.doubleInsertAtBegin(20);
		l.doubleInsertAtBegin(10);
		l.doubleInsertAtAnyPos(4, 45);
		l.doubleInsertAtAnyPos(5, 33);
		l.doubleInsertAtBegin(777);
		l.doubleInsertAtAnyPos(4, 333);
		l.display();
		l.doubleDeleteAtBegin();
		l.doubleDeleteAtAnyPos(2);
		
		l.display();
	}

	
}
