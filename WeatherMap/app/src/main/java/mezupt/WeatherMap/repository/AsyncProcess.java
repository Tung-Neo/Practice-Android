package mezupt.WeatherMap.repository;

import java.util.List;

import mezupt.WeatherMap.model.Main;
import mezupt.WeatherMap.model.Weather;


public interface AsyncProcess {
    void onFinished(List<Weather> weathers, Main main);
}
