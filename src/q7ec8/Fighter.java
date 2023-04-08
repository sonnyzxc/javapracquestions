package q7ec8;

import java.util.Random;

public class Fighter {

  private final String name;
  private final String type;
  private final int skill; //value between 1 to 18
  private int stamina; //value between 1 to 24
  private Random generator = new Random();

  public Fighter(String name, String type, int skill, int stamina) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
  }

  // Reduce the fighter's stamina accordingly
  public void takeDamage(int damage) {
    stamina = stamina < damage ? 0 : stamina - damage;
  }

  // Return the number of damage points to be inflicted on opponent
  public int calculateDamage() {
    return 2;
  }

  // Calculate an attack score for the fighter using the procedure described above
  public int calculateAttackScore() {
    return generator.nextInt(1, 6) + generator.nextInt(1, 6);
  }

  // Determine whether fighter is still alive
  public boolean isDead() {
    return stamina == 0;
  }

  public String getName() {
    return name;
  }

  public String displayStats() {
    return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
  }
}
