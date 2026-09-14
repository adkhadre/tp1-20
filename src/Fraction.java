public class Fraction  implements Comparable {
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



    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }
    public double doubleValue() {
        return (double) num / den;
    }
    public Fraction add(Fraction f){
        return new Fraction(
                this.num * f.den + f.num * this.den,
                this.den * f.den
        );
    }
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }


        if (!(o instanceof Fraction)) {
            return false;
        }

        Fraction f = (Fraction) o;

        return this.num * f.den ==  f.num * this.den ;
    }
    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Fraction))
            throw new ClassCastException("Impossible de comparé"+ obj.getClass().getName()+" à une Fraction");
        Fraction autre = (Fraction) obj;
        long produit1 = (long) this.num * autre.den;
        long produit2 = (long) autre.num * this.den;

        return Long.compare(produit1, produit2);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}