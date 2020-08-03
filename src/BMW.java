public class BMW  extends Auto_OOP


{

    boolean xDrive;
    public BMW(int ps, int türenAnzahl, String fahrzeugTyp, boolean xDrive)
    {
        super("BMW", ps, türenAnzahl,fahrzeugTyp);
        this.xDrive = xDrive;
    }

    @Override
    public void starten()
    {
    System.out.println("Der BMW startet!!!");
    }
}
