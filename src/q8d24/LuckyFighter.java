package q8d24;

import q7ec8.Fighter;

public class LuckyFighter extends Fighter {

  int luck; // set from 1 to 18
  Tactic strategy;

  // If a fighter gets hit during a battle, the fighter can test their luck: they roll two dice,
  // and are lucky if and only if the sum of the numbers on the dice is less than or equal to their
  // current luck. If the fighter is lucky, the damage inflicted is reduced by one, but if the fighter
  // is unlucky, the damage inflicted is increased by one.

  // Similarly, when a fighter hits their opponent the fighter can test their luck.
  // If lucky, the damage inflicted is doubled, but if unlucky, the damage inflicted
  // is decreased by one point.

  // Each time a fighter tests their luck, the luck value is decreased by one (until it reaches zero).
  // Note that testing luck is optional: it is a risky way to potentially inflict more damage on
  // one's opponent, or to take less damage, but if unlucky it has the opposite effect.
  public LuckyFighter(String name, String type, int skill, int stamina, Tactic strategy) {
    super(name, type, skill, stamina);
    this.strategy = strategy;
  }

  private enum Tactic {
    Aggressive,
    Defensive,
    Average
  }
}
