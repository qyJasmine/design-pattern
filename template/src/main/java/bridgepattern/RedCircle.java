package bridgepattern;

/**
 * concrete bridge class
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.printf("Drawing circle:[color:red, radius:%d, x:%d, y:%d]\n", radius, x, y);
    }
}
