package sandbox.sound;

public class Loud implements SoundProfile {

    @Override
    public void next(Sound profile) {
        profile.setProfile(new Vibrant());
    }

    @Override
    public void prev(Sound profile) {
        profile.setProfile(new Silent());
    }

    @Override
    public void printStatus() {
        System.out.println("Phone is loud!");
    }
}
