package models.person;

import models.person.abstraction.ISpeakEnglish;
import models.person.abstraction.ISpeakGerman;
import models.person.abstraction.ISpeakSpanish;
import models.person.utils.Greetings;

public interface ResponseThinker extends ISpeakEnglish, ISpeakSpanish, ISpeakGerman {

  default String replyToAGreeting(Greetings greetings){
    return switch (greetings){
      case HOLA -> speakSpanish();
      case HELLO -> speakEnglish();
      case HALLO -> speakGerman();
    };
  }

}
