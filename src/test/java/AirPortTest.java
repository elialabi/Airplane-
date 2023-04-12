import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirPortTest {
    Airplane airplane1;
    Airplane airplane2;
    Airplane airplane3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    AirPort airPort;


    @BeforeEach
    public void SetUp(){
        airPort = new AirPort();
        airplane1 = new Airplane("France", 32);
        airplane2 = new Airplane("Peru", 40);
        airplane3 = new Airplane("Japan", 60);

        passenger1 = new Passenger("Bob", 63, "passenger1@gmail.com");
        passenger2 = new Passenger("Joe", 10, "passenger2@Gmail.com");
        passenger3 = new Passenger("Sam", 30, "passenger3@gmail.com");
        airPort.addPassengers(passenger1);
        airPort.addPassengers(passenger2);
        airPort.addPassengers(passenger3);
        airPort.addFlights(airplane1);
        airPort.addFlights(airplane2);
        airPort.addFlights(airplane3);
    }

    @Test
    public void canAddPassenger(){
        assertThat(airPort.getPassengerCount()).isEqualTo(3);
    }
    @Test
    public void canAddFlight(){
        assertThat(airPort.getFlightCount()).isEqualTo(3);
    }
    @Test
    public void canCancelFlight(){
        airPort.removeFlights(airplane1);
        assertThat(airPort.getFlightCount()).isEqualTo(2);
    }
    @Test
    public void canDisplayFlights(){


    }





}
