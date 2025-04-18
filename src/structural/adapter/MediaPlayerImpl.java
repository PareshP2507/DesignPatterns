package structural.adapter;

public class MediaPlayerImpl implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerImpl(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName, String fileType) {
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (fileType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else {
            System.out.println("Invalid media type: " + fileType);
        }
    }
}
