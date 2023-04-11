import java.util.ArrayList;

public class Airplane {
    private String destination;
    private int ID;
    private ArrayList<Passenger> numPassengers;

    public Airplane(String destination, int ID){
        this.destination = destination;
        this.ID = ID;
        this.numPassengers = new ArrayList<>();

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Passenger> getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(ArrayList<Passenger> numPassengers) {
        this.numPassengers = numPassengers;
    }
}
