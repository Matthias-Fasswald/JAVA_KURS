public class Auto_OOP
{
    String marke;
    int ps;
    int türenAnzahl;
    String fahrzeugTyp;

    public Auto_OOP(String marke, int ps, int türenAnzahl, String fahrzeugTyp)
    {
        super();
        this.fahrzeugTyp = fahrzeugTyp;
        this.marke = marke;
        this.ps = ps;
        this.türenAnzahl = türenAnzahl;
    }

    public  void starten()
    {
        System.out.println("Auto startet");

    }

}
