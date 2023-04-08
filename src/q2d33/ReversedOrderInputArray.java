package q2d33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedOrderInputArray {

  static List<String> strArray = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    while (!line.equals("EXIT")) {
      strArray.add(line);
      line = br.readLine();
    }

    System.out.println("Input Array: " + strArray + "\n");

    Collections.reverse(strArray);

    for (String curLine : strArray) {
      System.out.println(curLine);
    }

  }



}
