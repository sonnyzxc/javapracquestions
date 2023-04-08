package qdc38.acyclic;

import java.util.HashSet;
import java.util.Set;

public class GroupAddress extends EmailAddress {

  private final Set<EmailAddress> members;

  public GroupAddress(String identifier) {
    super(identifier);
    members = new HashSet<>();
  }

  public void addEmailAddress(EmailAddress emailAddress) {
    members.add(emailAddress);
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> result = new HashSet<>();

    for (EmailAddress email : members) {
      result.addAll(email.getTargets());
    }
    return result;
  }
}
