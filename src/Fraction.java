public class Fraction {
    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction(int num) {
        this.num = num;
        den = 1;
    }

    public Fraction() {
        num = 0;
        den = 1;
    }

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}