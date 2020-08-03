public class AUDI extends Auto_OOP
{
    boolean quattro;
    public AUDI(int ps, int türenAnzahl, String fahrzeugTyp, boolean quattro)
    {
        super("Audi", ps, türenAnzahl, fahrzeugTyp);
        this.quattro = quattro;

    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("Audi startet!!!");
    }
}
