import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<Technology> Technologies = new ArrayList<>();

    public Developer(String fname, String iname, String adress, String email, String PESEL, int yearEmployed) {
        super(fname, iname, adress, email, PESEL, yearEmployed);
    }
    void addTechnology(Technology technology){
        Technologies.add(technology);
    }
}
