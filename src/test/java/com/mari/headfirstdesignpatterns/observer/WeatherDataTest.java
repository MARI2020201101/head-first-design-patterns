package com.mari.headfirstdesignpatterns.observer;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class WeatherDataTest {

    @Test
    public void observerTest() throws Exception {
        Observer observer1 = new WeatherDataDisplay();
        Observer observer2 = new WeatherDataDisplay();
        Observer observer3 = new WeatherDataDisplay();

        WeatherData weatherData = new WeatherData();
        weatherData.addObserver("observer1" , observer1);
        weatherData.addObserver("observer2" , observer2);
        weatherData.addObserver("observer3" , observer3);
        weatherData.setCount(3);
        weatherData.notifyObservers();
        weatherData.removeObserver("observer1");
        weatherData.notifyObservers();
    }

}
