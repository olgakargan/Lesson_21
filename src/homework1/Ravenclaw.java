package homework1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data

public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdomy;
    private int wit;
    private int creativity;


    public void compareStudents(Ravenclaw studentSecond) {
        int powerOne = this.mind + this.wisdomy + this.wit + this.creativity;
        int powerTwo = studentSecond.mind + studentSecond.wisdomy + studentSecond.wit + studentSecond.creativity;
        if (powerOne > powerTwo) {
            System.out.println(this.getName() + " stronger than " + studentSecond.getName());
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.getName() + " stronger than " + this.getName());
        } else {
            System.out.println(studentSecond.getName() + " the same strength " + this.getName());

        }

    }

    public Ravenclaw(String name, int witchcraft, int transgress, int mind, int wisdomy, int wit,
                     int creativity) {
        this.setName(name);
        this.setWitchcraft(witchcraft);
        this.setTransgress(transgress);
        this.mind = mind;
        this.wisdomy = wisdomy;
        this.wit = wit;
        this.creativity = creativity;

    }

    @Override
    public String toString() {
        return "I " + getName() +
                ", faculty='" + "Ravenclaw" +
                ", mind=" + mind +
                ", wisdomy=" + wisdomy +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", witchcraft=" + getWitchcraft() +
                ", transgress=" + getTransgress();
    }
}

