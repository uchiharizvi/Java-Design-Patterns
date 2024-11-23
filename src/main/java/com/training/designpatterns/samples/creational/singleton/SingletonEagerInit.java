package com.training.designpatterns.samples.creational.singleton;

public class SingletonEagerInit {
    private static final SingletonEagerInit INSTANCE = new SingletonEagerInit();

    /**
     * Private Constructor - so only Singleton can create its object
     */
    private SingletonEagerInit() {
    }

    public static SingletonEagerInit getInstance() {
        return INSTANCE;
    }

}
