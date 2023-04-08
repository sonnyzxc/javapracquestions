package qd363;

import java.util.StringTokenizer;

public class Person {
  private final String forenames;
  private final String surname;

  private final String nationalInsuranceNumber;

  public Person(String forename, String surname, String nationalInsuranceNumber) {
    this.forenames = forename;
    this.surname = surname;
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public String getInitials() {
    final StringBuilder result = new StringBuilder();
    StringTokenizer strTok = new StringTokenizer(forenames);
    while (strTok.hasMoreTokens()) {
      result.append(strTok.nextToken().charAt(0));
    }
    return result.toString() + surname.charAt(0);
  }

}