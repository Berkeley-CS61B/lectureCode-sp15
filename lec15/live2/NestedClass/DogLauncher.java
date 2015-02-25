/** DogLauncher
 *  @author Josh Hug
 */

public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog("Ted", "Beagle", 10);
        d.listenToVoice();
        Dog.VoiceInHead dvih = d.new VoiceInHead();
        dvih.encourage();
    }
} 