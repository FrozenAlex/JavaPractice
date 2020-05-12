package hw;

/**
 * AbsQueue
 */
public class AbsQueue extends AStack {

  AbsQueue(int capacity) {
    super(capacity);
  }

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

  @Override
  public int peek() {
    if (isEmpty())
      throw new Error("Queue is empty");

    return arr[back];
  }

}