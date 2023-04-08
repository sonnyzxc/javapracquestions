package q67dd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

  static int lines;
  static int words;
  static int chars = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    while (!line.equals("EXIT")) {
      String[] split = line.split(" ");
      lines++;
      words += split.length;
      for (String s : split) {
        System.out.println(s);
        chars += s.length();
      }
      line = br.readLine();
    }

    System.out.println("Lines: " + lines + "\nWords: " + words + "\nCharacters: " + chars);
  }
}
