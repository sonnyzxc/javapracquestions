package qe093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input number of iterations: ");
    int num;
    try {
      int input = Integer.parseInt(br.readLine());
      if (input <= 0) {
        throw new IllegalArgumentException("must be positive...");
      }
      num = input;
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (NumberFormatException e) {
      System.out.println("Please input an integer");
      return;
    }

    int sum = 0;
    for (int n = 0; n < num; n++) {
      System.out.println("Enter a positive integer:");
      try {
        int input = Integer.parseInt(br.readLine());
        if (input <= 0) {
          throw new IllegalArgumentException("Input must be a positive integer.");
        }
        sum += input;
      } catch (IOException e) {
        throw new RuntimeException(e);
      } catch (NumberFormatException e) {
        System.out.println("Error: Input is not an integer.");
        return;
      }

      double avg = (double) sum / num;
      System.out.println("Average: " + avg);
    }
  }
}

