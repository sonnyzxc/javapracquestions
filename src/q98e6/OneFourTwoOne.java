package q98e6;

public class OneFourTwoOne {

  private static int next(int x) {
    return x % 2 == 0 ? x / 2 : 3 * x + 1;
  }

  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);
    System.out.println(value);
    while (value != 1) {
      System.out.println(next(value));
      value = next(value);
    }
  }

}
