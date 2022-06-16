package models.person;

import java.text.MessageFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.person.abstraction.IGetInformation;

@Getter
@Setter
@Builder
public class Person implements IGetInformation, ResponseThinker {

  private String firstName;
  private String lastName;
  private int dni;

  @Override
  public String getInformation() {
    return MessageFormat.format("Hi, I'm {0} {1}. My ID number is {3}", firstName, lastName, dni);
  }
}
