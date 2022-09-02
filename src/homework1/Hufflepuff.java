package homework1;

public class Hufflepuff extends Hogwarts {

    private String industriousness;
    private String loyalty;
    private String honesty;


    public Hufflepuff(String name, String faculty, String industriousness, String loyalty, String honesty, String witchcraft, String transgress) {
        super(loyalty, honesty, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public String getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(String industriousness) {
        this.industriousness = industriousness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getHonesty() {
        return honesty;
    }

    public void setHonesty(String honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness='" + industriousness + '\'' +
                ", loyalty='" + loyalty + '\'' +
                ", honesty='" + honesty + '\'' +
                '}';
    }
}

