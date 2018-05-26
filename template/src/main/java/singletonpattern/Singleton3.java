package singletonpattern;

/**
 * mostly used, suggested
 * 1.not lazy loading, use classloader
 * 2.multi-thread safe without synchronized, high efficiency
 */
public class Singleton3 {

    // a single object of this class
    // based on classloader, to ensure multi-thread security
    private static Singleton3 instance = new Singleton3();

    // private constructor
    private Singleton3() {
        // code to initialize
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}