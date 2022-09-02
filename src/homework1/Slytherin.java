package homework1;

public class Slytherin extends Hogwarts {

    private String cunning;
    private String determination;
    private String ambition;
    private String resourcefulness;
    private String thirstForPower;


    public Slytherin(String name, String faculty, String cunning, String determination, String ambition, String resourcefulness, String thirstForPower) {
        super(determination, ambition, resourcefulness,thirstForPower);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public String getCunning() {
        return cunning;
    }

    public void setCunning(String cunning) {
        this.cunning = cunning;
    }

    public String getDetermination() {
        return determination;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }

    public String getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public String getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(String resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public String getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(String thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning='" + cunning + '\'' +
                ", determination='" + determination + '\'' +
                ", ambition='" + ambition + '\'' +
                ", resourcefulness='" + resourcefulness + '\'' +
                ", thirstForPower='" + thirstForPower + '\'' +
                '}';
    }
}