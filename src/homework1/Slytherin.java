package homework1;

import lombok.Data;

import java.util.Objects;

@Data
public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public void compareStudents(Slytherin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition +
                this.resourcefulness + this.thirstForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination +
                studentSecond.ambition + studentSecond.resourcefulness + studentSecond.thirstForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.getName() + " stronger than " + studentSecond.getName());
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.getName() + " stronger than " + this.getName());
        } else {
            System.out.println(studentSecond.getName() + " the same strength " + this.getName());

        }
    }

    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition,
                     int resourcefulness, int thirstForPower) {
        this.setName(name);
        this.setWitchcraft(witchcraft);
        this.setTransgress(transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "I " + getName() +
                ", faculty='" + "Slytherin" +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", witchcraft=" + getWitchcraft() +
                ", transgress=" + getTransgress();
    }
}

