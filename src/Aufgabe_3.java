public class Aufgabe_3
{
    public static void main(String[]args)
    {
        Rechnung(3.547f, 6.354f);
    }


    public static float Rechnung(float zahl1, float zahl2)
    {

        float ergenbins;
        float a = zahl1;
        float b = zahl2;
        ergenbins = a * b;

        System.out.println("ERGEBNIS: "+ergenbins);


        return ergenbins;
    }

}
