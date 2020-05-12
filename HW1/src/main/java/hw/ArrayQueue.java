package hw;

/**
 * Array Queue implementation circular queue.
 */
public class ArrayQueue implements IStack {
  int[] arr;
  int capacity;
  int back, front;

  ArrayQueue(int capacity) {
    this.capacity = capacity;
    arr = new int[capacity];
    back = front = -1;
  }

  /** Dequeue */
  @Override
  public int pop() {
    if (isEmpty())
      throw new Error("Queue is empty");

    int item = arr[back];
    if (back == front)
      back = front = -1;
    else
      back = (back + 1) % capacity;
    return item;
  }

  /**
   * Enqueue
   */
  @Override
  public void push(int item) {
    if (isFull())
      throw new Error("Array is full");
    else {
      front = (front + 1) % capacity;
      arr[front] = item;
      if (back == -1)
        back = front;
    }
  }

  public boolean isFull() {
    return (front + 1) % capacity == back;
  }

  @Override
  public boolean isEmpty() {
    return front == -1;
  }

  @Override
  public int peek() {
    if (isEmpty())
      throw new Error("Queue is empty");
    return arr[back];
  }

}