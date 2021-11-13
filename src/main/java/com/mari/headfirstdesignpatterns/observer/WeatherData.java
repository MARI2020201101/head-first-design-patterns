package com.mari.headfirstdesignpatterns.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Strings;

import java.util.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class WeatherData implements Subject{
    private Map<String,Observer> observerList = new HashMap<>();
    private int count;

    @Override
    public void removeObserver(String observerName) {
        Strings.isNotEmpty(observerName);
        if(observerList.containsKey(observerName)){
            observerList.remove(observerName);
        }
        System.out.println(observerName + " 님 구독해지");
    }

    @Override
    public void addObserver(String observerName, Observer observer) {

        if(! observerList.containsKey(observerName)){
            observerList.put(observerName, observer);
        }

        System.out.println(observerName + " 님 구독시작");

    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < count; i++) {
            for (Map.Entry<String, Observer> observer : observerList.entrySet()) {
                observer.getValue().update("information" + i);
            }
        }
    }

}
