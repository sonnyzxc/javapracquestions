package q014e;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

  public static void main(String[] args) {
    int size = 0;
    int limit = Integer.parseInt(args[0]);
    Set<Integer> numbers = new HashSet<>();
    Random generator = new Random();

    System.out.println("Generating random numbers: ");

    while (numbers.size() <= limit) {
      int x = generator.nextInt(limit) + 1;

      if (numbers.size() == limit) {
        System.out.print(x
            + "\nI had to generate " + size + " random numbers between 0 and " + limit
            + " to have produced all such numbers at least once.");
        break;
      } else {
        System.out.print(x + ", ");
      }

      numbers.add(x);
      size++;
    }


  }
}