package homework1;

public abstract class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public static void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond) {
        int powerOne = studentFirst.witchcraft + studentFirst.transgress;
        int powerTwo = studentSecond.witchcraft + studentSecond.transgress;
        if (powerOne > powerTwo) {
            System.out.println(studentFirst.name + " stronger than " + studentSecond.name);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.name + " stronger than " + studentFirst.name);
        } else {
            System.out.println(studentSecond.name + " the same strength " + studentFirst.name);

        }
    }

    public  void setWitchcraft(int witchcraft) {
        if (witchcraft < 0 || witchcraft > 100) {
            throw new RuntimeException("Invalid value entered");
        }
        this.witchcraft = witchcraft;
    }

    public void setTransgress(int transgress) {
        if (transgress < 0 || transgress > 100) {
            throw new RuntimeException("Invalid value entered");
        }
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "c{" +
                "name='" + name + '\'' +
                ", witchcraft='" + witchcraft + '\'' +
                ", transgress='" + transgress + '\'' +
                '}';
    }
}
