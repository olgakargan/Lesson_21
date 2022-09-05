package homework1;

import lombok.Data;
@Data

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public  void compareStudents(Gryffindor studentSecond) {
        int powerOne = this.nobility + this.honor + this.bravery;
        int powerTwo = studentSecond.nobility + studentSecond.honor + studentSecond.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.getName() + " stronger than " + studentSecond.getName());
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.getName() + " stronger than " + this.getName());
        } else {
            System.out.println(studentSecond.getName() + " the same strength " + this.getName());

        }
    }

    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        this.setName(name);
        this.setWitchcraft(witchcraft);
        this.setTransgress(transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "I " + getName() +
                ", faculty='" + "Gryffindor " +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", witchcraft=" + getWitchcraft() +
                ", transgress=" + getTransgress();

    }
}


