package q1aeb;

public interface NumberAdder<T extends Number> {
  // Return a number of type T that represents zero
  public T zero();

  // Return the sum of x and y
  public T add(T x, T y);
}
