public class Operatoren
{
    public static void main(String[]args)
    {
        int Zahl = 5;
        int Zahl1 = 10;
        int Zahl2 = 20;

        int ergebnis;
        ergebnis = Zahl1 + Zahl2;
        System.out.println("Das + Ergebnis ist: " +ergebnis);

        ergebnis = Zahl1 - Zahl2;
        System.out.println("Das - Ergebnis ist: " +ergebnis);

        ergebnis = Zahl2 / Zahl1;
        System.out.println("Das / Ergebnis ist: " +ergebnis);

        ergebnis = Zahl1 * Zahl2;
        System.out.println("Das * Ergebnis ist: " +ergebnis);

        Zahl++;
        System.out.println("Das ++ Ergebnis ist: " +Zahl);

        Zahl--;
        System.out.println("Das ++ Ergebnis ist: " +Zahl);


        int lebenGegner = 100;
        int geschosEnergie = 20;

        lebenGegner = lebenGegner - geschosEnergie;
        System.out.println("Leben Gegner: " +lebenGegner);

        // ZuweisungsOperator
        lebenGegner -= geschosEnergie;
        System.out.println("Leben Gegner: " +lebenGegner);


        if(lebenGegner == 60)
        {
            System.out.println("Du brauchst wieder Leben");
        }




    }
}
