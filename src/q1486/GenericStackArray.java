package q1486;

public class GenericStackArray<E> implements GenericStack<E> {
  private static final int STACK_LIMIT = 100;
  private final E[] elements;
  private int stackPointer;

  // Creates an empty string stack
  public GenericStackArray() {
    elements = (E[]) new Object[STACK_LIMIT];
    stackPointer = 0;
  }

  // If the stack is full, does nothing.
  // Otherwise, pushes the given String on to the top of the stack
  @Override
  public void push(E item) {
    if (stackPointer < STACK_LIMIT) {
      elements[stackPointer] = item;
      stackPointer++;
    }
  }

  // If the stack is empty, leaves the stack unchanged and returns
  // null.  Otherwise, removes the string that is on the top of
  // the stack and returns it
  @Override
  public E pop() {
    if (stackPointer > 0) {
      E temp = elements[stackPointer];
      stackPointer--;
      return temp;
    }
    return null;
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }
}
