import homework1.*;

public class Main {


    public static void main(String[] args) {

        Gryffindor HarryPotter = new Gryffindor("Harry Potter", 41, 26, 28, 45, 56);
        Gryffindor HermioneGranger = new Gryffindor("Hermione Granger", 43, 27, 29, 11, 25);
        Gryffindor RonWeasley = new Gryffindor("Ron Weasley", 14, 8, 10, 20, 4);


        Slytherin DracoMalfoy = new Slytherin("Draco Malfoy", 11, 6, 8, 12, 13, 14, 56);
        Slytherin GrahamMontague = new Slytherin("Graham Montague", 13, 7, 9, 11, 15, 22, 26);
        Slytherin GregoryGoyle = new Slytherin("Gregory Goyle", 14, 8, 10, 10, 14, 12, 16);


        Hufflepuff ZachariahSmith = new Hufflepuff("Zachariah Smith", 15, 48, 3, 6, 18);
        Hufflepuff CedricDiggory = new Hufflepuff("Cedric Diggory", 13, 35, 8, 4, 7);
        Hufflepuff JustinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 10, 4, 7, 21, 16);

        Ravenclaw ZhouChang = new Ravenclaw("Zhou Chang", 11, 16, 18, 12, 36, 24);
        Ravenclaw PadmaPatil = new Ravenclaw("Padma Patil", 13, 17, 29, 11, 5, 14);
        Ravenclaw MarcusBelby = new Ravenclaw("Marcus Belby", 14, 88, 10, 10, 14, 24);

        System.out.println(HarryPotter);
        System.out.println(GrahamMontague);
        System.out.println(ZachariahSmith);
        System.out.println(PadmaPatil);

        HarryPotter.compareStudents(RonWeasley);
        Hogwarts.compareStudents(HarryPotter, DracoMalfoy);

        DracoMalfoy.compareStudents(GrahamMontague);
        Hogwarts.compareStudents(DracoMalfoy , ZachariahSmith);

        ZachariahSmith.compareStudents(JustinFinchFletchley);
        Hogwarts.compareStudents(ZachariahSmith , MarcusBelby);

        PadmaPatil.compareStudents(MarcusBelby);
        Hogwarts.compareStudents(PadmaPatil, GregoryGoyle);

    }
}

