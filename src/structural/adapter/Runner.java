package structural.adapter;

public class Runner {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("it_really_whips.mp3");

        VideoPlayer videoPlayer = new VideoPlayer(audioPlayer);
        videoPlayer.play("test.mp4");
        videoPlayer.play("test1.mp4");
        videoPlayer.play("test2.mp4");
    }
}
