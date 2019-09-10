package sandbox.sound;

public class Vibrant implements SoundProfile {

    @Override
    public void next(Sound profile) {
        profile.setProfile(new Silent());
    }

    @Override
    public void prev(Sound profile) {
        profile.setProfile(new Loud());
    }

    @Override
    public void printStatus() {
        System.out.println("Phone is in vibrant state.");
    }
}
