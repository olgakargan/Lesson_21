import homework1.Gryffindor;
import homework1.Hufflepuff;
import homework1.Ravenclaw;
import homework1.Slytherin;

public class Main {
    static Gryffindor[] gryffindor = new Gryffindor[3];
    static Slytherin[] slytherin = new Slytherin[3];
    static Hufflepuff[] hufflepuff = new Hufflepuff[3];

    static Ravenclaw[] ravenclaw = new Ravenclaw[3];

    public static void main(String[] args) {

        gryffindor[0] = new Gryffindor("Harry Potter", "Slytherin", "11", "6", "8", "12", "6");
        gryffindor[1] = new Gryffindor("Hermione Granger", "Slytherin", "13", "7", "9", "11", "5");
        gryffindor[2] = new Gryffindor("Ron Weasley", "Slytherin", "14", "8", "10", "10", "4");


        slytherin[0] = new Slytherin("Draco Malfoy", "Slytherin", "11", "6", "8", "12", "6");
        slytherin[1] = new Slytherin("Graham Montague", "Slytherin", "13", "7", "9", "11", "5");
        slytherin[2] = new Slytherin("Gregory Goyle", "Slytherin", "14", "8", "10", "10", "4");


        hufflepuff[0] = new Hufflepuff("Zachariah Smith", "Slytherin", "15", "8", "3", "6", "8");
        hufflepuff[1] = new Hufflepuff("Cedric Diggory", "Slytherin", "13", "5", "8", "4", "7");
        hufflepuff[2] = new Hufflepuff("Justin Finch-Fletchley", "Slytherin", "10", "4", "7", "1", "6");


        ravenclaw[0] = new Ravenclaw("Zhou Chang", "ravenclaw", "11", "6", "8", "12", "6");
        ravenclaw[1] = new Ravenclaw("Padma Patil", "ravenclaw", "13", "7", "9", "11", "5");
        ravenclaw[2] = new Ravenclaw("Marcus Belby", "ravenclaw", "14", "8", "10", "10", "4");

        printAllGryffindor();
        printAllSlytherin();
        printAllHufflepuff();
        printAllRavenclaw();


    }

    public static void printAllGryffindor() {
        for (Gryffindor gryffindor : gryffindor) {
            System.out.println(gryffindor);
        }
    }
    public static void printAllHufflepuff() {
        for (Hufflepuff hufflepuff : hufflepuff) {
            System.out.println(hufflepuff);
        }
    }
    public static void printAllSlytherin() {
        for (Slytherin slytherin : slytherin) {
            System.out.println(slytherin);
        }
    }
    public static void printAllRavenclaw() {
        for (Ravenclaw ravenclaw : ravenclaw) {
            System.out.println(ravenclaw);
        }
    }
}