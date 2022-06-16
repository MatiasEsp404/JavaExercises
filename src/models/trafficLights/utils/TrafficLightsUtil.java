package models.trafficLights.utils;

import java.text.MessageFormat;
import java.time.ZonedDateTime;

public abstract class TrafficLightsUtil {

  private static int amount = 0;

  public static int askForNumber() {
    amount++;
    return amount;
  }

  public static Light initialColor() {
    Light light = askForColor(amount);
    status(amount, light);
    return light;
  }

  public static Light askForColor(int id) {
    ZonedDateTime time = ZonedDateTime.now();
    if (time.getSecond() < 20) {
      return (id % 2 == 0) ? Light.GREEN : Light.RED;
    } else if (time.getSecond() < 30) {
      return Light.YELLOW;
    } else if (time.getSecond() < 50) {
      return (id % 2 == 0) ? Light.RED : Light.GREEN;
    } else {
      return Light.YELLOW;
    }
  }

  public static void status(int id, Light light) {
    System.out.println(
        MessageFormat.format("Traffic light number {0}: {1} light.", id, light));
  }

}
