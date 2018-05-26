package abstractfactorypattern;

import factorypattern.Color;
import factorypattern.Shape;

// todo: cannot understand the application of abstract factory pattern
public abstract class AbstractFactory {
    public abstract Shape getShape(Class<? extends Shape> clazz);
    public abstract Color getColor(Class<? extends Color> clazz);
}
