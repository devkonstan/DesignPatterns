package sandbox.sound;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VibrantTests {
    private Sound sound;
    private Vibrant vibrantProfile;

    @Before
    public void setUp() {
        sound = new Sound();
        vibrantProfile = new Vibrant();
    }

    @Test
    public void next_Profile() {
        //when
        vibrantProfile.next(sound);
        //then
        assertTrue(sound.getProfile() instanceof Silent);
    }

    @Test
    public void prev_Profile() {
        //when
        vibrantProfile.prev(sound);
        //then
        assertTrue(sound.getProfile() instanceof Loud);
    }

    @Test
    public void print_Profile() {
        //given
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        //when
        vibrantProfile.printStatus();

        //then
        verify(out).println("Phone is in vibrant state.");
    }
}
