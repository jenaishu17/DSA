package day5;

public class circular_linked {

    Node last;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public circular_linked() {
        last = null;
    }

    // ✅ Insert at the beginning
    public void InsertAtBegin(int val) {
        Node newNode = new Node(val);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    // ✅ Insert at any position
    public void insertAtAnyPos(int val, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(val);
        if (pos == 1) {
            InsertAtBegin(val);
            return;
        }

        Node temp = last.next;
        int count = 1;

        while (count < pos - 1 && temp != last) {
            temp = temp.next;
            count++;
        }

        if (count != pos - 1) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == last) {
            last = newNode;
        }
    }

    // ✅ Delete at the beginning
    public void deleteAtBegin() {
        if (last == null) {
            System.out.println("List is empty, cannot delete!");
            return;
        }

        if (last.next == last) { // Only one node
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    // ✅ Delete at any position
    public void deleteAtAnyPos(int pos) {
        if (last == null || pos < 1) {
            System.out.println("Invalid position or list is empty!");
            return;
        }

        Node temp = last.next, prev = last;
        int count = 1;

        if (pos == 1) {
            deleteAtBegin();
            return;
        }

        do {
            if (count == pos) {
                prev.next = temp.next;
                if (temp == last) { // Deleting last node
                    last = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
            count++;
        } while (temp != last.next);

        System.out.println("Position out of bounds!");
    }

    // ✅ Display the circular linked list
    public void display() {
        if (last == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println();
    }

    // ✅ Driver Code
    
}
