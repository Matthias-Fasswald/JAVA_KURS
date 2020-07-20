public class Beispiel_Methoden
{
    public static void main(String[]args)
    {


        int gegnerLeben = 100;
        gegnerLeben = (gegnerLeben);
        System.out.println("Leben: "+gegnerHit(gegnerLeben));
    }

    public static int gegnerHit(int aktuellesLeben)
    {
        int neuGegnerLeben;
        neuGegnerLeben = aktuellesLeben -20;
        return neuGegnerLeben;
    }

}
