package sandbox.sound;

public class Main {
    public static void main(String[] args) {
        Sound sound = new Sound();
        sound.printStatus();

        sound.nextProfile();
        sound.printStatus();

        sound.nextProfile();
        sound.printStatus();

        sound.previousProfile();
        sound.printStatus();
    }

}
