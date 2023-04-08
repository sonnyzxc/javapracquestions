package q8a61;

import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientIntSet implements IntSet {

  private final List<Integer> ints;

  public MemoryEfficientIntSet() {
    ints = new ArrayList<>();
  }

  @Override
  public void add(int x) {
    if (!ints.contains(x)) {
      ints.add(x);
    }
  }

  @Override
  public boolean remove(int x) {
    return ints.remove(Integer.valueOf(x));
  }

  @Override
  public boolean isEmpty() {
    return ints.isEmpty();
  }

  @Override
  public boolean contains(int x) {
    return ints.contains(x);
  }
}
