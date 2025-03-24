package day5;

public class stack {
    int[] stack1 = new int[10]; 
    int top = -1; 

    
    public void push(int val) {
        if (top < 9)
        { 
            stack1[++top] = val; 
        } 
        else
        {
            System.out.println("Stack Overflow!");
        }
    }

   
    public void pop() {
        if (top >= 0)
        { 
            System.out.println("Popped: " + stack1[top--]); 
        } 
        else
        {
            System.out.println("Stack Underflow!");
        }
    }

    
    public void peek() {
        if (top >= 0)
        {
            System.out.println("Top Value: " + stack1[top]);
        } 
        else
        {
            System.out.println("Stack is Empty!");
        }
    }

   
    public void display() {
        if (top >= 0) 
        {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--)
            { 
                System.out.println(stack1[i] + " ");
            }
        } 
        else {
            System.out.println("Stack is Empty!");
        }
    }
}