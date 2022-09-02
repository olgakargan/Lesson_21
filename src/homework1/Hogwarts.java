package homework1;

import java.util.Objects;

public class Hogwarts {
    private String name;
    private String faculty;
    private String witchcraft;
    private String transgress;


    public Hogwarts(String name, String faculty, String witchcraft, String transgress) {
        this.name = name;
        this.faculty = faculty;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(String witchcraft) {
        this.witchcraft = witchcraft;
    }

    public String getTransgress() {
        return transgress;
    }

    public void setTransgress(String transgress) {
        this.transgress = transgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwarts)) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return Objects.equals(getName(), hogwarts.getName()) && Objects.equals(getFaculty(), hogwarts.getFaculty()) && Objects.equals(getWitchcraft(), hogwarts.getWitchcraft()) && Objects.equals(getTransgress(), hogwarts.getTransgress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFaculty(), getWitchcraft(), getTransgress());
    }

    @Override
    public String toString() {
        return "c{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", witchcraft='" + witchcraft + '\'' +
                ", transgress='" + transgress + '\'' +
                '}';
    }
}
