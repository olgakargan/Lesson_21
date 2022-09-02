package homework1;

public class Gryffindor extends Hogwarts {

    private String nobility;
    private String honor;
    private String bravery;


    public Gryffindor(String name, String faculty, String nobility, String honor, String bravery, String witchcraft, String transgress) {
        super(honor, bravery, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public void setBravery(String bravery) {
        this.bravery = bravery;
    }
}


