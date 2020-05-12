package hw;

public abstract class AStack {
  int[] arr;
  int capacity;
  int front = -1, back = -1; // -1

  AStack(int capacity) {
    this.capacity = capacity;
    this.arr = new int[capacity];
  }

  public void push(int item) {
    if (isFull())
      throw new Error("Queue is full");
    front = (front + 1) % capacity;
    arr[front] = item;
    if (back == -1)
      back = front;
  };

  public abstract int pop();

  public boolean isFull() {
    return (front + 1) % capacity == back;
  };

  public boolean isEmpty() {
    return front == -1;
  };

  public abstract int peek();
}