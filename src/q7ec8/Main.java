package q7ec8;

import java.util.Random;

public class Main {

  static Random generator = new Random();
  static Fighter player1;
  static Fighter player2;

  static GameEngine gameEngine = new GameEngine();

  public static void main(String[] args) {
    player1 = new Fighter("Joe", "Human Warrior", generator.nextInt(1, 18),
        generator.nextInt(1, 24));
    player2 = new Fighter("Alex", "Elf Lord", generator.nextInt(1, 18),
        generator.nextInt(1, 24));

    System.out.println("At start of battle, stats are:");
    System.out.println("Player1");
    System.out.println("Player2");

    gameEngine.simulateBattle(player1, player2);
  }
}
