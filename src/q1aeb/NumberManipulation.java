package q1aeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberManipulation {

  public static <T extends Number> Set<T> readNumbers(int n, NumberParser<T> parser)
      throws IOException {
    Set<T> result = new HashSet<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < n; i++) {
      System.out.println("Enter number (of type " + parser.typeParsed() + "): ");
      result.add(parser.parseNumber(br.readLine()));
//      System.out.printf("Enter number (of type %s):%n", parser.typeParsed());
    }
    return result;
  }

  public static <T extends Number> T addNumbers(Set<T> numbers, NumberAdder<T> adder) {
    T result = adder.zero();

    for (T num : numbers) {
      result = adder.add(result, num);
    }

    return result;
  }

  public static <T extends Number> void displayAsDoubles(Set<T> numbers) {
    System.out.print("[ ");

    for (Iterator<? extends Number> it = numbers.iterator(); it.hasNext(); ) {
      System.out.print(it.next().intValue());
      if (it.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public static void displayAsInts(Set<? extends Number> numbers) {
    System.out.print("[ ");

    for (Iterator<? extends Number> it = numbers.iterator(); it.hasNext(); ) {
      System.out.print(it.next().intValue());
      if (it.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public static void main(String[] args) throws IOException {
    System.out.println("Please enter five doubles, one line at a time");
    Set<Double> doubles = readNumbers(5, new DoubleParser());

    System.out.println("Please enter five ints, one line at a time");
    Set<Integer> ints = readNumbers(5, new IntegerParser());

    double sumOfDoubles = addNumbers(doubles, new DoubleAdder());
    int sumOfInts = addNumbers(ints, new IntegerAdder());

    System.out.println("Sum of all doubles is " + sumOfDoubles);

    System.out.println("Sum of all ints is " + sumOfInts);

    System.out.println("Ints as doubles:");

    displayAsDoubles(ints);

    System.out.println("Doubles as ints");

    displayAsInts(doubles);
  }

}
