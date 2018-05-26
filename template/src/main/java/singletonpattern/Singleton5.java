package singletonpattern;

/**
 * used when lazy loading is anxiously needed
 * 1.lazy loading, by inner class
 * 2.multi-thread safe, by classloader of inner class
 */
public class Singleton5 {
    // inner class
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){}

    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
