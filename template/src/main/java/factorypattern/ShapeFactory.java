package factorypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is the factory for getting object of some type.
 * Created by qyJasmine on 2018/5/26.
 */
public class ShapeFactory {

    private static final Logger LOG = LoggerFactory.getLogger(ShapeFactory.class);

    /**
     * get an object
     * @param clazz actual class
     * @return object
     */
    public Shape getShape(Class<? extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
            return (Shape) obj;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            LOG.error("Fail to get object, error:{}", e.getMessage());
            return null;
        }
    }

    public static <T> T getClass(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
            LOG.error("Fail to get object, error:{}", e.getMessage());
        }
        return obj;
    }

//    public static void main(String[] args) {
//        Circle circle = ShapeFactory.getClass(Circle.class);
//        circle.draw();
//    }
}
