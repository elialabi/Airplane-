import java.util.ArrayList;

public class Passenger {
    private String name;
    private int ID;
    private String email;
    private ArrayList<Airplane> flights;

    public Passenger(String name, int ID, String email){
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.flights = new ArrayList<>();
    }








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
