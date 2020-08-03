public class Kuh extends Tier
{

    int hufe;

    public Kuh(String name, int gewicht, int größe, int hufe)
    {
        super(name, gewicht, größe);
        this.hufe = hufe;

    }

    @Override
    public void essen() {
        super.essen();
        System.out.println("Die Kuh muss ihr Essen noch kauen!");
    }
}
