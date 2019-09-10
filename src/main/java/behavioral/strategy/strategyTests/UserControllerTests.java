package behavioral.strategy.strategyTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTests {


    private GamepadController pad; //testowana klasa

    @Mock
    private MobileRobot robot; //mockujemy zaleznosci a nie klasy tworzace

//    korzystam z tej metody jesli nie chce recznie tworzyc testowanego obiektu -> pomija sie etap @Before
//    mechanizm ten nazywa sie Inversion of Control (biblioteka sama tworzy mocki)
//    @InjectMocks
//    private GamepadController pad;

    @Before
    public void setUp() {
        // robot = Mockito.mock(MobileRobot.class); //mozemy tez tak zamockowac (zamiast @Mock)
        pad = new GamepadController(robot); //w ten sposob mozemy wstrzyknac na konstruktora mocka
    }

    // ten test jako 1. -> sprawdzenie czy sama metoda analogPositionChanged() dziala w ogole
    @Test
    public void testIfPosChanged() {
        //Given

        //When
        pad.analogPositionChanged(5, 10);

        //Then
        verify(robot, times(1)).move(anyDouble(), anyDouble());
        verify(robot, atMost(1)).move(anyDouble(), anyDouble());
        verify(robot, atLeastOnce()).move(anyDouble(), anyDouble());

    }
}
