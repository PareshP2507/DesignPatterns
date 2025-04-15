package structural.adapter;

public class Runner {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("it_really_whips.mp3");

        Player player = new VideoPlayer(audioPlayer);
        player.play("test.mp4");
        player.play("test1.mp4");
        player.play("test2.mp4");
    }
}
