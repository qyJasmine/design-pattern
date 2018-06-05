package adapterpattern;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Play mp3 file of name:" + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.printf("Media type:%s is not supported.\n", audioType);
        }
    }
}
