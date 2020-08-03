public class Hund extends Tier
{
    int zaehne;

    public Hund(String name, int gewicht, int groeße)
    {
        super(name, groeße, gewicht);
        this.zaehne = zaehne;
    }

    public void bellen()
    {

    }

    @Override
    public void essen()
    {
        System.out.println("Der Hund muss sein essen noch kauen");

        super.essen();
    }
}
