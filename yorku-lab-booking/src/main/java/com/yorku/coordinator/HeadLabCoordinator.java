package com.yorku.coordinator;
public class HeadLabCoordinator {

    private static HeadLabCoordinator instance;

    private HeadLabCoordinator() {}

    public static HeadLabCoordinator getInstance() {

        if(instance == null) {
            instance = new HeadLabCoordinator();
        }

        return instance;
    }

    public void generateLabManager(String name) {
        System.out.println("Lab manager account created for: " + name);
    }
}