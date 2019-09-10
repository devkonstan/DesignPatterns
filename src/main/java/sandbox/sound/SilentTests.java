package sandbox.sound;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SilentTests {

    private Sound sound;
    private Silent silentProfile;

    @Before
    public void setUp() {
        sound = new Sound();
        silentProfile = new Silent();
    }

    @Test
    public void next_Profile() {
        //when
        silentProfile.next(sound);
        //then
        assertTrue(sound.getProfile() instanceof Loud);
    }

    @Test
    public void prev_Profile() {
        //when
        silentProfile.prev(sound);
        //then
        assertTrue(sound.getProfile() instanceof Vibrant);
    }

    @Test
    public void print_Profile() {
        //given
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        //when
        silentProfile.printStatus();

        //then
        verify(out).println("Phone remains silent.");
    }
}
