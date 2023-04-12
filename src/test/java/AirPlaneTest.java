import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirPlaneTest {

    Airplane airplane;

    @BeforeEach
    public void setUp(){
        airplane = new Airplane("UAE", 23);
    }
    @Test
    public void canGetFlightName(){
        assertThat(airplane.getDestination()).isEqualTo("UAE");
        assertThat(airplane.getDestination()).isNotEqualTo("Namoi");

    }
    @Test
    public void canGetFlightID(){
        assertThat(airplane.getID()).isEqualTo(23);
        assertThat(airplane.getID()).isNotEqualTo(6);

    }



}
