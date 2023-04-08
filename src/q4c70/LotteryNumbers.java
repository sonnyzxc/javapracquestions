package q4c70;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumbers {
  static Random generator = new Random();
  static Set<Integer> numbers = new HashSet<>();
  public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) {
      int x = generator.nextInt(49);

      while (!numbers.contains(x)) {
        x = generator.nextInt(49);
        numbers.add(x);
      }
      System.out.println(i <= 6 ? "Number " + i + ": " + x : "Bonus Number: " + x);

    }
  }
}
