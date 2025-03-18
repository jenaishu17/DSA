package day2;

public class Linked_ex {

	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	
	public Linked_ex()
	{
		head=null;
	}
   
	
	public void insertAtBegin(int val) {
		Node newNode=new Node(val);
		if(head==null) 
		{
		head=newNode;	
		}
		else
		{
			Node temp=head;
			newNode.next=temp;
			head=newNode;
		}
	}
	public void display() {
	    Node temp = head;	  
	        while (temp != null) {
	            System.out.print(temp.data+" "); 
	            temp = temp.next; 
	        }
	   
	}

}
