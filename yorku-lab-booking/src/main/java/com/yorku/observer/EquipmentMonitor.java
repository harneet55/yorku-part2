package com.yorku.observer;
public class EquipmentMonitor implements Observer {

    @Override
    public void update(String status) {
        System.out.println("Equipment status update: " + status);
    }
}