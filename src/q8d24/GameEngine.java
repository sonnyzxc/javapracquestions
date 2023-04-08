package q8d24;

import java.util.Random;

public class GameEngine<E extends LuckyFighter> {

  Random generator = new Random();
  // lol gave up

  private String simulateSubBattle(E first, E second) {
    System.out.println("------------------------------");
    int firstAttackScore = first.calculateAttackScore();
    int secondAttackScore = second.calculateAttackScore();
    String retStr;
    if (firstAttackScore > secondAttackScore) {
      retStr = first.getName() + " hits " + second.getName() + ", stats are:";
      second.takeDamage(first.calculateDamage());
    } else if (firstAttackScore < secondAttackScore) {
      retStr = second.getName() + " hits " + first.getName() + ", stats are:";
      first.takeDamage(second.calculateDamage());
    } else {
      retStr = first.getName() + " draws with " + second.getName();
    }
    return retStr;
  }

  // Simulate battle between two fighters, displaying how the battle
  // progresses and who wins
  public void simulateBattle(E first, E second) {
    while (!(first.isDead() || second.isDead())) {
      System.out.println("------------------------------");
      int firstAttackScore = first.calculateAttackScore();
      int secondAttackScore = second.calculateAttackScore();
      String retStr;
      int luckyNumber1 = generator.nextInt(1, 100);
      int luckyNumber2 = generator.nextInt(1, 100);

      if (luckyNumber1 == 1) {
        retStr = "hI";
      } else {
        System.out.println(simulateSubBattle(first, second));
      }
      System.out.println(first.displayStats());
      System.out.println(second.displayStats());
    }

    System.out.println("------------------------------");
    if (first.isDead()) {
      System.out.println("End of battle, " + second.displayStats() + " wins!");
    } else {
      System.out.println("End of battle, " + first.displayStats() + " wins!");
    }
  }
}
