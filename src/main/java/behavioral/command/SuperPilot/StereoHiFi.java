package behavioral.command.SuperPilot;

public class StereoHiFi {
    void turnOn() {
        System.out.println("wlaczono wieze stereo");
    }
    void turnOff() {
        System.out.println("wylaczono!");
    }
    void setCD() {
        System.out.println("odpalam cd XD");
    }
    void setDVD() {}
    void setRadio() {}
    void setVolume(int vol) {
        System.out.println("ustawiono glosnosc na:"+vol);
    }
}
