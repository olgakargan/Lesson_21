package homework1;

public class Ravenclaw extends Hogwarts{



    private String mind;
    private String wisdomy;
    private String wit;
    private String creativity;


    public Ravenclaw(String name, String faculty, String mind, String wisdomy, String wit, String creativity, String witchcraft) {
        super(name, faculty, mind, wisdomy, wit, creativity, witchcraft);

        this.mind = mind;
        this.wisdomy = wisdomy;
        this.wit = wit;
        this.creativity = creativity;

    }
}
