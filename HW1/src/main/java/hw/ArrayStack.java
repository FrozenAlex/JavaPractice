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
    if (position == capacity)
      throw new Error("Stack overflow");
    stack[position++] = item;
  }

  public int pop() {
    if (isEmpty())
      throw new Error("Stack is empty");

    return stack[--position];
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
    if (isEmpty())
      throw new Error("Stack is empty");

    return stack[position - 1];
  }
}