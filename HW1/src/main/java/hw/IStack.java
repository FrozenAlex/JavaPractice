package hw;

public interface IStack {
    public void push(int item);

    public int pop();

    public boolean isFull();

    public boolean isEmpty();

    public int peek();
}