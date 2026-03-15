package com.yorku.observer;
import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String status) {

        for(Observer o : observers) {
            o.update(status);
        }
    }

    public void detectUsage(String status) {
        notifyObservers(status);
    }
}