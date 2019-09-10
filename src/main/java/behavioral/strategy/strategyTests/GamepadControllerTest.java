package behavioral.strategy.strategyTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GamepadControllerTest {

    @Mock
    private MobileRobot robot; //mockujemy robota -> jest on zaleznoscia

    private GamepadController pad; //testowana klasa

    @Before
    public void setUp() {

        pad = new GamepadController(robot);
    }

    //testujemy poprawnosc logiki - test 2.
    @Test
    public void controllingTest() {
        // Given
        double xAxis = 4.5;
        double yAxis = 6.7;
        final int ANALOG_TO_RPM_RATIO = 100;

        // When
        pad.analogPositionChanged(xAxis, yAxis);

        // Then
        //verify dziala tylko ma mockach
        verify(robot,times(1)).move(xAxis*ANALOG_TO_RPM_RATIO,yAxis*ANALOG_TO_RPM_RATIO);
    }
}