import java.util.Stack;

public class StackTest {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public void Stack() {
        capacity = 10; // Initial capacity
        stackArray = new int[capacity];
        top = -1;
    }

    // Pushes a value onto the stack
    public void push(int value) {
        if (top == capacity - 1) {
            resize(); // Resize the array if it's full
        }
        stackArray[++top] = value;
    }

    // Pops the top value from the stack
    public int pop() {
        if (isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        return stackArray[top--];
    }

    // Peeks at the top value of the stack
    public int peek() {
        if (isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        return stackArray[top];
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Returns the size of the stack
    public int size() {
        return top + 1;
    }

    // Resizes the stack array when it's full
    private void resize() {
        capacity *= 2; // Double the capacity
        int[] newArray = new int[capacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    // Example usage
    public static void main(String[] args) {
        StackTest stack = new StackTest();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
        System.out.println(stack.size()); // Output: 1
    }
}
