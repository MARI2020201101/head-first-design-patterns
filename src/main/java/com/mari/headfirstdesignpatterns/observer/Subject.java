package com.mari.headfirstdesignpatterns.observer;

interface Subject {

    void removeObserver(String observerName);
    void addObserver(String observerName, Observer observer);
    void notifyObservers();
}
