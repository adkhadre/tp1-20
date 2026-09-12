public class Fraction {
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
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