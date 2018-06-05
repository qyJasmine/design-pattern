package adapterpattern;

/**
 * a kind of advanced media player
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName){
        System.out.println("I cannot play this file:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file of name:" + fileName);
    }
}
