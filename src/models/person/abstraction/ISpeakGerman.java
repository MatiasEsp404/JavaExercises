package models.person.abstraction;

public interface ISpeakGerman {
  default String speakGerman(){
    return "Hallo, guten Morgen";
  }
}
