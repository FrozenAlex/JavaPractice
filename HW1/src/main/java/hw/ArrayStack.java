package hw;

/*
Stack array implementation. 
*/
public class ArrayStack implements IStack {
    // Array that represents a stack
    private int[] stack;
    private int position = 0;
    private int capacity;

    ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
    }

    public void push(int item) {
        if (position == 50) {
            throw new Error("Stack overflow xD");
        }
        stack[position++] = item;
    }

    public int pop() {
        if (position > 0) {
            return stack[--position];
        } else {
            System.out.println("Nothing else in the stack");
            return 0;
        }
    }

    @Override
    public boolean isFull() {
        return position == capacity;
    }

    public boolean isEmpty() {
        return position == 0;
    }

    @Override
    public int peek() {
        if (position > 0) {
            return stack[position - 1];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
}