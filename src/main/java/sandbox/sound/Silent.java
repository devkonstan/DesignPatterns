package sandbox.sound;

public class Silent implements SoundProfile {

    @Override
    public void next(Sound profile) {
        profile.setProfile(new Loud());
    }

    @Override
    public void prev(Sound profile) {
        profile.setProfile(new Vibrant());
    }

    @Override
    public void printStatus() {
        System.out.println("Phone remains silent.");
    }
}
