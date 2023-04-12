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

    public void displayFlights(){
        for(Airplane airplane : this.airplanes){
            System.out.println(airplane.getDestination() + " " + airplane.getID());

        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airplane airplane1;
        Airplane airplane2;
        Airplane airplane3;

        airplane1 = new Airplane("France", 32);
        airplane2 = new Airplane("Peru", 40);
        airplane3 = new Airplane("Japan", 60);

        AirPort airPort = new AirPort();






        String answer = "yes";
        System.out.println("Would you like to see all available flights yes/no?");
        while(true){
            String input = scanner.nextLine();
            try{
                if(input.equals(answer)) {
                  airPort.displayFlights();
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
