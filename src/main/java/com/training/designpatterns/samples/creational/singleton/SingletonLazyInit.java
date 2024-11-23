package com.training.designpatterns.samples.creational.singleton;

public class SingletonLazyInit {
    private static SingletonLazyInit instance;

    /**
     * Private Constructor - why?
     *
     */
    private SingletonLazyInit() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    /**
     * 1. Initial Check
     *      a) When getInstance() is called for the first time, the instance variable is null.
     * 	    b) The null check allows the Singleton class to create a new instance only when
     * 	        required.
     * 2. Instance Creation
     *      A new instance is created only at the first request. Subsequent calls return the already
     *      created instance, avoiding unnecessary object creation.
     * 3. Thread Safety Synchronized Block
     *      a) In multithreaded environments, multiple threads could check for instance == null
     *      simultaneously, leading to multiple instances being created.
     *      b) To prevent this, the synchronized block ensures only one thread can execute
     *      the instance creation code at a time.
     * 4. Double-Checked Locking
     *      The second if (instance == null) inside the synchronized block ensures the instance
     *      hasn’t already been initialized by another thread while the current thread was waiting.
     * @return
     */
    public static SingletonLazyInit getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyInit.class) {
                if (instance == null) {
                    instance = new SingletonLazyInit();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
