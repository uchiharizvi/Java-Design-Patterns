package com.training.designpatterns.samples.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLazyInit singletonLazyInit = SingletonLazyInit.getInstance();
        singletonLazyInit.showMessage();
    }
}
