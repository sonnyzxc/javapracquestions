package q8a61;

import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientIntSet implements IntSet {

  public final Set<Integer> ints;

  public SpeedEfficientIntSet() {
    ints = new HashSet<>();
  }

  @Override
  public void add(int x) {
    ints.add(x);
  }

  @Override
  public boolean remove(int x) {
    return ints.remove(x);
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
