package hw;

/**
 * Array Queue implementation circular queue.
 */
public class ArrayQueue implements IStack {
    int[] arr;
    int capacity;
    int front, back;

    ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = back = -1;
    }

    /** Dequeue */
    @Override
    public int pop() {
        if (isEmpty() == true) {
            System.out.println("Queue is empty!");
            return 0;
        } else {
            int item = arr[front];
            if (front == back)
                front = back = -1;
            else
                front = (front + 1) % capacity;
            return item;
        }
    }

    /**
     * Enqueue
     */
    @Override
    public void push(int item) {
        if (isFull())
            System.out.println("Queue is full!");
        else {
            back = (back + 1) % capacity;
            arr[back] = item;
            if (front == -1)
                front = back;
        }
    }

    public boolean isFull() {
        return (back + 1) % capacity == front;
    }

    @Override
    public boolean isEmpty() {
        return back == -1;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front];
        }
    }

}