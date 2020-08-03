public class Tier
{
    String name;
    int gewicht;
    int groeße;

    public Tier(String name, int gewicht, int groeße)
    {
        this.name = name;
        this.gewicht = gewicht;
        this.gewicht = groeße;
    }

    public void essen()
    {
        System.out.println("Das Tier hat gegessen!");
    }
}
