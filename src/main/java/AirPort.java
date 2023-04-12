import java.util.ArrayList;
import java.util.Scanner;

public class AirPort {
    private ArrayList<Passenger> passengers;
    private ArrayList<Airplane> airplanes;


    public AirPort(){
        this.airplanes = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }
    public int getFlightCount(){
        return this.airplanes.size();
    }
    public void addPassengers(Passenger passenger){
        this.passengers.add(passenger);
    }
    public void addFlights(Airplane airplane){
        this.airplanes.add(airplane);
    }
    public void removeFlights(Airplane airplane) {
        this.airplanes.remove(airplane);
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int answer = 1;
        System.out.println("Would you like to see all available flights? if so, press 1. If not press any other number");
        while(true){
            String input = scanner.nextLine();
            try{
                if( Integer.parseInt(input) == 1) {
                    System.out.println("Flight1 to France ID: 30, Flight2 to Peru ID: 40,Flight3 to Japan ID: 60");
                    break;
                }
                else {
                    System.out.println("Have a nice day sir/madam");
                    break;
                }

            }
            catch(NumberFormatException e) {
                System.out.println("sorry please type a number");
            }

        }
    }
























    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

}
