package qe6fd;

public class BitSet8 implements BitSet {
  private byte representation;

  public BitSet8() {
    representation = 0;
  }

  @Override
  public void add(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("Value not in range");
    }
    representation |= 1 << x;
  }

  @Override
  public void remove(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("Value not in range");
    }
    representation &= 1 << x;
  }

  @Override
  public boolean contains(int x) {
    if (!inRange(x)) {
      return false;
    }
    return ((1 << x) & representation) != 0;
  }

  @Override
  public void intersectWith(BitSet s) {
    if (s instanceof BitSet8) {
      representation &= ((BitSet8) s).representation;
    } else {
      for (int x = 0; inRange(x); x++) {
        if (!s.contains(x)) {
          remove(x);
        }
      }
    }
  }

  @Override
  public int maxStorableValue() {
    return Byte.SIZE;
  }

  @Override
  public String toString() {
    final StringBuilder result = new StringBuilder("{ ");
    boolean first = true;
    for (int x = 0; inRange(x); x++) {
      if (contains(x)) {
        if (first) {
          first = false;
        } else {
          result.append(", ");
        }
        result.append(x);
      }
    }
    return result + " }";
  }

  private boolean inRange(int x) {
    return x >= 0 && x < maxStorableValue();
  }
}
