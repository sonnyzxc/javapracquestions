package q2d33;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReversedOrderInputDeque {

  static Deque<String> myDeque = new ArrayDeque<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    while (!line.equals("EXIT")) {
      myDeque.push(line);
      line = br.readLine();
    }

    System.out.println(myDeque);

    while (!myDeque.isEmpty()) {
      System.out.println(myDeque.pop());
    }
  }

}
