package factorypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

public class ColorFactory {
    private static final Logger LOG = LoggerFactory.getLogger(ColorFactory.class);

    public static <T> T getColor(Class<? extends Color> clazz) {
        T obj = null;
        try {
            obj = (T) clazz.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException |
                InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            LOG.error("Fail to get color, error:{}", e.getMessage());
        }
        return obj;
    }

//    public static void main(String[] args) {
//        Color red = getColor(Red.class);
//        red.fill();
//    }
}
