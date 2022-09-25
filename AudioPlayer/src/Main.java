import javax.sound.sampled.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws LineUnavailableException,UnsupportedAudioFileException, IOException {

        File file = new File("KUCKUCK.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
    }
}
