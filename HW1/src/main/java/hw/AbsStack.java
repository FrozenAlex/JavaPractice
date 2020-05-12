package hw;

/**
 * AbsStack
 */
public class AbsStack extends AStack {

  AbsStack(int capacity) {
    super(capacity);
  }

  @Override
  public int pop() {
    if (isEmpty())
      throw new Error("Stack is empty");

    int item = arr[front];
    if (front == back)
      front = back = -1;
    else
      front = (front - 1) % capacity;
    return item;

  }

  @Override
  public int peek() {
    if (isEmpty())
      throw new Error("Stack is empty");

    return arr[front];
  }

}