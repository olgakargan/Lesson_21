package homework1;

public class Gryffindor extends Hogwarts {

    private String nobility;
    private String honor;
    private String bravery;


    public Gryffindor(String name, String faculty, String nobility, String honor, String bravery, String witchcraft, String transgress) {
        super(name, faculty, nobility, honor, bravery, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}


