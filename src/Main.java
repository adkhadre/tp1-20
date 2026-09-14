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

        Fraction f6 = new Fraction(1, 2);
        Fraction f7 = new Fraction(2, 4);
        Fraction f8 = new Fraction(3, 4);

        assert f6.equals(f7) : "Erreur : 1/2 devrait être égal à 2/4";
        assert !f6.equals(f8) : "Erreur : 1/2 ne devrait pas être égal à 3/4";
        assert f6.equals(f6) : "Erreur : une fraction devrait être égale à elle-même";

        System.out.println("Test égalité réussi");


        Fraction f9 = new Fraction(1, 2);
        Fraction f10 = new Fraction(3, 4);
        Fraction f11 = new Fraction(2, 4);

        assert f9.compareTo(f10) < 0 :
                "Erreur : f9 devrait être inférieur à f10";

        assert f10.compareTo(f9) > 0 :
                "Erreur : f10 devrait être supérieur à f9";

        assert f9.compareTo(f11) == 0 :
                "Erreur : f9 devrait être égal à f11";

        System.out.println("Test comparaison réussi");



    }
}