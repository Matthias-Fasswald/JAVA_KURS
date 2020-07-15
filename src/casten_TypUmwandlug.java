public class casten_TypUmwandlug
{
    public static void main(String[]args)
    {
        int userAlter = (int)18.5; //(int) = castoperator
        System.out.println(userAlter);


        // Implizites Casten von klein nach groß
        int Zahl1 = 30;
        double Zahl2 = Zahl1;
        System.out.println(Zahl2);



        // Explizites Casten von groß nach klein
        int auto1 = (int)3450.45;
        int auto2 = (int)2690.94;

        int gesammtPreis;
        gesammtPreis = auto1 + auto2;
        System.out.println(gesammtPreis);

    }

}
