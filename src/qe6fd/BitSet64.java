package qe6fd;

public class BitSet64 implements BitSet {
  private long representation;

  public BitSet64() {
    representation = 0;
  }

  @Override
  public void add(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("Value not in range");
    }
    representation |= 1L << x;
  }

  @Override
  public void remove(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("Value not in range");
    }
    representation &= 1L << x;
  }

  @Override
  public boolean contains(int x) {
    if (!inRange(x)) {
      return false;
    }
    return ((1L << x) & representation) != 0;
  }

  @Override
  public void intersectWith(BitSet s) {
    if (s instanceof BitSet64) {
      representation &= ((BitSet64) s).representation;
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
    return Long.SIZE;
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
