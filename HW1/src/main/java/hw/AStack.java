package hw;

public abstract class AStack {
    private int[] arr;
    private int capacity;

    AStack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public abstract void push(int item);

    public abstract int pop();

    public abstract boolean isFull();

    public abstract boolean isEmpty();

    public abstract int peek();
}