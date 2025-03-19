package day2;

public class Singly_LinkedList {

	public static void main(String args[]) {
		Linked_ex l=new Linked_ex();
		l.insertAtBegin(60);
		l.insertAtBegin(50);
		l.insertAtBegin(40);
		l.insertAtBegin(30);
		l.insertAtBegin(20);
		l.insertAtBegin(10);
		l.insertAtBegin(777);
		l.display();
		l.insertAtAnyPos(4, 333);
		l.display();
	}
	
	
}

