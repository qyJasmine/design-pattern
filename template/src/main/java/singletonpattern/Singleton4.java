package singletonpattern;

/**
 * used when particularly needed
 * use DCL(double checked locking), require JDK 1.5~
 * 1.lazy loading
 * 2.multi-thread safe, high efficiency
 */
public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
