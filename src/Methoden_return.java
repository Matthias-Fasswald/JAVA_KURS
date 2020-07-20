public class Methoden_return
{
    public static void main(String[]args)
    {
        taschenrechner(5, 5, '-');
    }

    public static int taschenrechner(int zahl1, int zahl2, char operator)
    {
        int summe = zahl1 + zahl2;
        int differenz = zahl1 - zahl2;
        char Operator = operator;
        if(operator == '+')
        {
            System.out.println("Sie haben addierr: "+summe);
        }
        else
        {
            System.out.println("Sie haben subtrahiert: "+differenz);
        }


        return summe;
    }
}
