package q876b;

import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    Set<B> setOfB = new HashSet<>();
    System.out.println(setOfB);
    Set<? extends A> setOfA = setOfB;
    System.out.println(setOfA);
  }
}
