package com.training.designpatterns.samples.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        if(instance!=null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
