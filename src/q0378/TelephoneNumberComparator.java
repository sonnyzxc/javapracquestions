package q0378;

public class TelephoneNumberComparator implements PersonComparator {

  @Override
  public int comapreTo(Person first, Person second) {
    return first.getTelephoneNumber().compareTo(second.getTelephoneNumber());
  }

  @Override
  public int compareTo(Person first, Person second) {
    return first.getTelephoneNumber().compareTo(second.getTelephoneNumber());
  }
}
