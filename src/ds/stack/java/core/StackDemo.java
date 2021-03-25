package ds.stack.java.core;

// Java program to demonstrate the accessing of the elements from the stack
import java.util.Stack;

public class StackDemo {

    // Main Method
    public static void main(String args[]) {
        // Creating an empty Stack
        Stack<String> stack = new Stack<>();

        // Pushes an element on the top of the stack.
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        // Returns the element on the top of the stack, but does not remove it.
        System.out.println("The element at the top of the stack is: " + stack.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);

        // Removes and returns the top element of the stack. An ‘EmptyStackException’
        // An exception is thrown if we call pop() when the invoking stack is empty.
        System.out.println("The element at the top of the stack is: " + stack.pop());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);

        // It returns true if nothing is on the top of the stack. Else, returns false
        System.out.println("Stack isEmpty: " + stack.isEmpty());
    }
}