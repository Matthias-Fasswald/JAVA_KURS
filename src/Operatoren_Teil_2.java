public class Operatoren_Teil_2
{
    public static void main(String[]args)
    {
        int lebenGegner = 10;
        boolean hit = true;

        int a = 3;
        int b = 3;
        boolean c; // true oder false

        c = a == b;

        System.out.println(c);



        if(lebenGegner == 0 || hit == true)
            System.out.println("Gegner zerstört");
        else
            System.out.println("Gegner hat noch: " +lebenGegner + " Punkte");





    }
}
