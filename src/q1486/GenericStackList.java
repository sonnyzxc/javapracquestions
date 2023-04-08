package q1486;

import java.util.ArrayList;
import java.util.List;

public class GenericStackList<E> implements GenericStack<E> {
  private List<E> elements;

  public GenericStackList() {
    elements = new ArrayList<>();
  }

  @Override
  public void push(E item) {
    elements.add(item);
  }

  @Override
  public E pop() {
    if (!isEmpty()) {
      return elements.remove(elements.size() - 1);
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return elements.size() == 0;
  }
}
