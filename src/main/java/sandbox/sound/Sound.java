package sandbox.sound;

public class Sound {

    private SoundProfile profile = new Loud();

    public SoundProfile getProfile() {
        return profile;
    }

    public void setProfile(SoundProfile profile) {
        this.profile = profile;
    }

    public void previousProfile() {
        profile.prev(this);
    }

    public void nextProfile() {
        profile.next(this);
    }

    public void printStatus() {
        profile.printStatus();
    }
}
