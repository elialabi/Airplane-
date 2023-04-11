import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach

    public void setUp(){
        passenger = new Passenger("Joe", 42, "abcairways@gmail.com");

    }
     @Test
    public void canGetPassengerName(){
        assertThat(passenger.getName()).isEqualTo("Joe");
        assertThat(passenger.getName()).isNotEqualTo("Namoi");

     }
     @Test
    public void canGetPassengerID(){
        assertThat(passenger.getID()).isEqualTo(42);
        assertThat(passenger.getID()).isNotEqualTo(6);

     }
     @Test
    public void canGetPassengerEmail(){
        assertThat(passenger.getEmail()).isEqualTo("abcairways@gmail.com");
        assertThat(passenger.getEmail()).isNotEqualTo("zyxairways@gmail.com");

     }





}

