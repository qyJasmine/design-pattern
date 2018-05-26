package singletonpattern;

/**
 * not suggested
 * used when getInstance() method is not frequently called
 * 1.lazy loading
 * 2.multi-thread safe by adding synchronized, low efficiency
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
