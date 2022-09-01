import homework1.Gryffindor;
import homework1.Hufflepuff;
import homework1.Ravenclaw;
import homework1.Slytherin;

public class Main {

    public static void main(String[] args) {
        Gryffindor[] gryffindor = new Gryffindor[3];
        gryffindor[0] = new Gryffindor("Harry Potter", "Slytherin", "11", "6", "8", "12", "6");
        gryffindor[1] = new Gryffindor("Hermione Granger", "Slytherin", "13", "7", "9", "11", "5");
        gryffindor[2] = new Gryffindor("Ron Weasley", "Slytherin", "14", "8", "10", "10", "4");

        Slytherin[] slytherin = new Slytherin[3];
        slytherin[0] = new Slytherin("Draco Malfoy", "Slytherin", "11", "6", "8", "12", "6");
        slytherin[1] = new Slytherin("Graham Montague", "Slytherin", "13", "7", "9", "11", "5");
        slytherin[2] = new Slytherin("Gregory Goyle", "Slytherin", "14", "8", "10", "10", "4");

        Hufflepuff[] hufflepuff = new Hufflepuff[3];
        hufflepuff[0] = new Hufflepuff("Zachariah Smith", "Slytherin", "15", "8", "3", "6", "8");
        hufflepuff[1] = new Hufflepuff("Cedric Diggory", "Slytherin", "13", "5", "8", "4", "7");
        hufflepuff[2] = new Hufflepuff("Justin Finch-Fletchley", "Slytherin", "10", "4", "7", "1", "6");

        Ravenclaw[] ravenclaw = new Ravenclaw[3];
        ravenclaw[0] = new Ravenclaw("Zhou Chang", "ravenclaw", "11", "6", "8", "12", "6");
        ravenclaw[1] = new Ravenclaw("Padma Patil", "ravenclaw", "13", "7", "9", "11", "5");
        ravenclaw[2] = new Ravenclaw("Marcus Belby", "ravenclaw", "14", "8", "10", "10", "4");

        System.out.println(hufflepuff);
        System.out.println(slytherin);
        System.out.println(gryffindor);
        System.out.println(ravenclaw);
    }



}