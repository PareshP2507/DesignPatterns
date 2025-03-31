package structural.adapter;

public class AudioPlayer implements Player {

    @Override
    public void play(String fileName) {
        System.out.println("Playing audio track from audio file: " + fileName);
    }
}
