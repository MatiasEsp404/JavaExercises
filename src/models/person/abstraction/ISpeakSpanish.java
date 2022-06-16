package models.person.abstraction;

public interface ISpeakSpanish {
  default String speakSpanish(){
    return "Hola, buen día";
  }
}
