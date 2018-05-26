package singletonpattern;

/**
 * used when prohibit creating object by deserialization
 * by using Enum, this method is multi-thread safe, and support serialization automatically
 * require JDK 1.5~
 */
public enum Singleton6 {
    INSTANCE;

    public void whateverMethod(){}
}
