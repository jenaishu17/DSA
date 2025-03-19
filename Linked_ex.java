package day2;

public class Linked_ex {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    public Linked_ex() {
        head = null;
    }  
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
        }
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 
    public void insertAtAnyPos(int pos, int val) {
        Node newNode = new Node(val);     
                if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;       
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("The position is out of range.");
                return;
            }
            temp = temp.next;
        }        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    
}
