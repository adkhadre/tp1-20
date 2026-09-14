public class Main{
    public static void main(String[] args){
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction();
        assert f1.toString().equals("2/3"): "Erreur constructeur avec deux paramétres";
        assert f2.toString().equals("5/1"): "Erreur constructeur avec un paramétre";
        assert f3.toString().equals("0/1"):  "Erreur constructeur sans paramétre";

        System.out.println("Teste toString réussi");

        Fraction f = new Fraction(1, 2);
        assert f.doubleValue() == 0.5: "Erreur : conversion en double";
        System.out.println("Test converstion réussi");

        Fraction f4 = new Fraction(1, 2);
        Fraction f5 = new Fraction(1, 3);

        Fraction result = f4.add(f5);

        assert result.getNum() == 5;
        assert result.getDen() == 6;

    }
}