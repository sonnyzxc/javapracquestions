package q1486;

public class Demo {

  public static void transferStacks(GenericStack dst, GenericStack src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {

    final GenericStack first = new GenericStackArray();

    final GenericStack second = new GenericStackList();

    first.push("The");
    first.push("quick");
    first.push("brown");
    first.push("fox");
    first.push("jumped");
    first.push("over");
    first.push("the");
    first.push("lazy");
    first.push("dog");

    transferStacks(second, first);

    assert first.isEmpty();

    while (!second.isEmpty()) {
      System.out.println(second.pop());
    }
  }
}
