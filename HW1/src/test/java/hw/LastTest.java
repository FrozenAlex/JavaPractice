package hw;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the last task
 */
public class LastTest {
  @Test
  public void testReverseOddAbstract() {
    int[] testArray = { 1, 2, 3, 4, 5 };
    int[] reverseArray = { 1, 4, 3, 2, 5 };
    int[] result = new int[testArray.length];

    // Create classes
    AStack queue = new AbsQueue(testArray.length);
    AStack stack = new AbsStack(testArray.length);

    // Push all elements
    for (int i = 0; i < testArray.length; i++) {
      if (i % 2 == 0) {
        queue.push(testArray[i]);
      } else {
        stack.push(testArray[i]);
      }
    }
    // Loop once again to get the result
    for (int i = 0; i < testArray.length; i++) {
      if (i % 2 == 0) {
        result[i] = queue.pop();
      } else {
        result[i] = stack.pop();
      }
    }
    assertArrayEquals("Array should be reversed", reverseArray, result);
  }

  @Test
  public void testReverseAbstract() {
    int[] testArray = { 1, 2, 3, 4, 5 };
    int[] reverseArray = { 5, 4, 3, 2, 1 };
    int[] result = new int[testArray.length];

    // Create a class
    AStack stack = new AbsStack(testArray.length);

    // Push all elements
    for (int i : testArray)
      stack.push(i);
    int count = 0;
    while (!stack.isEmpty())
      result[count++] = stack.pop();

    assertArrayEquals("Array should be reversed", reverseArray, result);
  }

  @Test
  public void testOverflow() {
    // Create classes
    AStack queue = new AbsQueue(1);
    AStack stack = new AbsStack(1);

    // Push one element to both
    queue.push(1);
    stack.push(1);

    // Make an array of errors
    Error[] result = new Error[2];

    // Get the errors
    try {
      queue.push(1);
    } catch (Error err) {
      result[0] = err;
    }

    try {
      stack.push(1);
    } catch (Error err) {
      result[1] = err;
    }

    assertEquals("Queue is not overflowing", "Queue is full", result[0].getMessage());
    assertEquals("Stack is not overflowing", "Queue is full", result[1].getMessage());
  }
}