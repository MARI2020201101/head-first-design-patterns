package com.mari.headfirstdesignpatterns.observer;

public class WeatherDataDisplay implements Observer{
    @Override
    public void update(Object infomation) {
        System.out.println(infomation);
        System.out.println("---------");
    }
}
