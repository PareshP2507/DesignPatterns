package structural.adapter;

public class VideoPlayer implements Player {
    
    private final AudioPlayer audioPlayer;

    public VideoPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play(String fileName) {
        playVideo(fileName);
        playAudio(fileName);
    }

    private void playVideo(String fileName) {
        System.out.println("Playing video track from video file: " + fileName);
    }

    private void playAudio(String fileName) {
        audioPlayer.play(fileName);
    }
}
