package sandbox.sound;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

public class LoudTests {

    private Sound sound;
    private Loud loudProfile;

    @Before
    public void setUp() {
        sound = new Sound();
        loudProfile = new Loud();
    }

    @Test
    public void next_Profile() {
        //when
        loudProfile.next(sound);
        //then
        assertTrue(sound.getProfile() instanceof Vibrant);
    }

    @Test
    public void prev_Profile() {
        //when
        loudProfile.prev(sound);
        //then
        assertTrue(sound.getProfile() instanceof Silent);
    }

    @Test
    public void print_Profile() {
        //given
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        //when
        loudProfile.printStatus();

        //then
        verify(out).println("Phone is loud!");
    }
}
