package qfe94;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

  static List<String> reverseEachString(List<String> input) {
    return input
        .stream()
        .map(StringBuilder::new)
        .map(StringBuilder::reverse)
        .map(StringBuilder::toString)
        .collect(Collectors.toList());
  }

  static List<String> reverseEachStringMonolithic(List<String> input) {
    return input
        .stream()
        .map(item -> new StringBuilder(item).reverse().toString())
        .collect(Collectors.toList());
  }

  static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input
        .stream()
        .filter(item -> item.length() > 0)
        .filter(item -> Character.isDigit(item.charAt(0)))
        .map(item -> Integer.parseInt(item.substring(0, 1)))
        .map(Math::sqrt)
        .collect(Collectors.toList());
  }

  static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input
        .stream()
        .filter(item -> item.length() > 0 && Character.isDigit(item.charAt(0)))
        .map(item -> Math.sqrt(Integer.parseInt(item.substring(0, 1))))
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    final List<String> stringsA = List.of("i know the alphabet!", "i am sleepy");
    final List<String> stringsB = List.of("1astring", "2anotherstring", "ant", "eater",
        "-1nofirstdigit", "9anotherstring", "88only8getsrooted");

    System.out.println(reverseEachString(stringsA).equals(reverseEachStringMonolithic(stringsA)));
    System.out.println(sqrtsOfFirstDigits(stringsB).equals(sqrtsOfFirstDigitsMonolithic(stringsB)));
  }
}
