package models.trafficLights;

import java.text.MessageFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.trafficLights.abstraction.ITrafficLights;
import models.trafficLights.utils.Light;
import models.trafficLights.utils.TrafficLightsUtil;

@Getter
@Setter
@Builder
public class TrafficLights implements ITrafficLights {

  private int id;
  private Light light;

  @Override
  public void changeColor() {
    Light backup = light;
    light = TrafficLightsUtil.askForColor(id);
    if (backup != light) {
      TrafficLightsUtil.status(id, light);
    }
  }


}
