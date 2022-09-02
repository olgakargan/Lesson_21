package homework1;

public class Ravenclaw extends Hogwarts{



    private String mind;
    private String wisdomy;
    private String wit;
    private String creativity;


    public Ravenclaw(String name, String faculty, String mind, String wisdomy, String wit, String creativity, String witchcraft) {
        super(wisdomy, wit, creativity, witchcraft);
        this.mind = mind;
        this.wisdomy = wisdomy;
        this.wit = wit;
        this.creativity = creativity;

    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public String getWisdomy() {
        return wisdomy;
    }

    public void setWisdomy(String wisdomy) {
        this.wisdomy = wisdomy;
    }

    public String getWit() {
        return wit;
    }

    public void setWit(String wit) {
        this.wit = wit;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind='" + mind + '\'' +
                ", wisdomy='" + wisdomy + '\'' +
                ", wit='" + wit + '\'' +
                ", creativity='" + creativity + '\'' +
                '}';
    }
}
