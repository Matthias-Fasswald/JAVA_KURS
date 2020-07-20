public class Methoden_return_2
{
    public static void main(String[]args)
    {
        int a = summe();
        System.out.println("Wert: "+a);
        int summe = a -5;
        System.out.println("Wert: "+summe);

    }
    public static int summe()
    {
        int a, b, summe;

        a = 10;
        b = 20;
        summe = a + b;
        return summe;
    }

}
