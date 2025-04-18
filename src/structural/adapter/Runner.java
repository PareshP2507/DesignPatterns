package structural.adapter;

public class Runner {
    
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl(new AdvancedMediaPlayer());

        mediaPlayer.play("song.mp3", "mp3");
        mediaPlayer.play("movie.mp4", "mp4");
        mediaPlayer.play("document.txt", "txt");
    }
}
