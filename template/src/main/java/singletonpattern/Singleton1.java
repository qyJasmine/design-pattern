package singletonpattern;

/**
 * not suggested
 * the easiest way for singleton pattern
 * 1.lazy loading
 * 2.insecure for multi-thread
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
