package qf79b;

public class PerfectPalindromeCubes {

  private static boolean isPalindrome(String x) {
    StringBuilder str = new StringBuilder(x);
    str.reverse();
    return str.toString().equals(x);
  }

  public static void main(String[] args) {
    int size = 0;
    int num = 0;
    while (size < 10) { // size should be 1500
      int cubed = (int) Math.pow(num, 3);
      if (isPalindrome(String.valueOf(cubed))) {
        System.out.println(num + " cubed is " + cubed);
        size++;
      }
      num++;
    }


  }
}
