package main;

import java.time.ZonedDateTime;
import models.trafficLights.TrafficLights;
import models.person.Person;
import models.person.utils.Greetings;
import models.trafficLights.utils.TrafficLightsUtil;

public class Main {

  public static void main(String... args) {
    firstExercise();
    secondExercise();
    thirdExercise();
  }

  private static void thirdExercise(){

  }

  private static void secondExercise() {
    TrafficLights trafficLights1 = buildTrafficLights();
    TrafficLights trafficLights2 = buildTrafficLights();
    runTheTime(trafficLights1, trafficLights2);
  }

  private static TrafficLights buildTrafficLights(){
    return TrafficLights.builder()
        .id(TrafficLightsUtil.askForNumber())
        .light(TrafficLightsUtil.initialColor())
        .build();
  }

  private static void runTheTime(TrafficLights trafficLights1, TrafficLights trafficLights2){
    long timeLimit = ZonedDateTime.now().plusMinutes(1).toEpochSecond();
    do {
      trafficLights1.changeColor();
      trafficLights2.changeColor();
    } while (timeLimit > ZonedDateTime.now().toEpochSecond());
  }

  private static void firstExercise() {
    Person matias = buildPerson();
    System.out.println(matias.replyToAGreeting(Greetings.HOLA));
  }

  private static Person buildPerson(){
    return Person.builder()
        .firstName("Matias")
        .lastName("Espinola")
        .dni(46167369)
        .build();
  }

}
