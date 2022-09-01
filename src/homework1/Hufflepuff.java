package homework1;

public class Hufflepuff extends Hogwarts {

    private String industriousness;
    private String loyalty;
    private String honesty;


    public Hufflepuff(String name, String faculty, String industriousness, String loyalty, String honesty, String witchcraft, String transgress) {
        super(name, faculty, industriousness, loyalty, honesty, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }
}

