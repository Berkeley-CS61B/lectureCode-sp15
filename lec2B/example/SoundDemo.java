/** 
 *  @author Josh Hug
 */

public class SoundDemo {
    public static void main(String[] args) {
        double[] soundData = StdAudio.read("ee20.wav");
        StdAudio.play(soundData);
    }
} 