package models.person.abstraction;

public interface ISpeakEnglish {
  default String speakEnglish(){
    return "Hello, good morning";
  }
}
