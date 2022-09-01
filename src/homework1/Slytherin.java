package homework1;

public class Slytherin extends Hogwarts {

    private String cunning;
    private String determination;
    private String ambition;
    private String resourcefulness;
    private String thirstForPower;


    public Slytherin(String name, String faculty, String cunning, String determination, String ambition, String resourcefulness, String thirstForPower) {
        super(name, faculty, cunning, determination, ambition, resourcefulness,thirstForPower);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }



}