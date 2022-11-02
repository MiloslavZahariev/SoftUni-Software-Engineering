import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name, List<Person> firstTeam, List<Person> reserveTeam) {
        this.name = name;
        this.firstTeam = firstTeam;
        this.reserveTeam = reserveTeam;
    }

    public Team(String name) {
        setName(name);
        firstTeam = new ArrayList<>();
        reserveTeam = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFirstTeam(List<Person> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public void setReserveTeam(List<Person> reserveTeam) {
        this.reserveTeam = reserveTeam;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);

    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void addPlayer(Person person) {
        if(person.getAge() < 40){
            firstTeam.add(person);
        }else {
            reserveTeam.add(person);
        }
    }
}
