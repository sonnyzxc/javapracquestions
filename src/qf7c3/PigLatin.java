package qf7c3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


// lol this is broken af but cba to fix

public class PigLatin {

  static StringBuilder returnStr = new StringBuilder();
  static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

  private static void addRemainingStrings(Boolean flag, String str) {
    int strLen = str.length();

    if (strLen > 2) {
      returnStr.append(flag ? Character.toUpperCase(str.charAt(1))
          : str.charAt(1) + str.substring(2, strLen) + Character.toLowerCase(str.charAt(0)) + "ay")
      ;
    } else {
      returnStr.append(flag ? Character.toUpperCase(str.charAt(1))
          : str.charAt(1) + Character.toLowerCase(str.charAt(0)) + "ay");
    }

  }

  public static void main(String[] args) throws IOException {
    boolean capitalFlag;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] arr = line.split(" ");

    for (String s : arr) {
      System.out.println(s);
      capitalFlag = Character.isUpperCase(s.charAt(0));
      if (vowels.contains(Character.toLowerCase(s.charAt(0)))) {
        returnStr.append(s + "way");
      } else {
        addRemainingStrings(capitalFlag, s);
      }
    }

    System.out.println(returnStr.toString());
  }
}
