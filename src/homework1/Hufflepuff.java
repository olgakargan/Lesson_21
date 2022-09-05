package homework1;

import lombok.Data;

@Data
public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;


    public void compareStudents(Hufflepuff studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.getName() + " stronger than " + studentSecond.getName());
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.getName() + " stronger than " + this.getName());
        } else {
            System.out.println(studentSecond.getName() + " the same strength " + this.getName());

        }
    }

    public Hufflepuff(String name, int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        this.setName(name);
        this.setWitchcraft(witchcraft);
        this.setTransgress(transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    @Override
    public String toString() {
        return "I " + getName() +
                ", faculty='" + "Hufflepuff" +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", witchcraft=" + getWitchcraft() +
                ", transgress=" + getTransgress();
    }
}

