package adapterpattern;

/**
 * a kind of advanced media player
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file of name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("I cannot play this file:" + fileName);
    }
}
