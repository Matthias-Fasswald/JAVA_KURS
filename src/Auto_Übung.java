public class Auto_Übung
{
    String autoMarke;
    Reifen_Übung reifen;



    public Auto_Übung(String autoMarke, String reifenMarke, String reifenTyp)
    {
        this.autoMarke = autoMarke;
        reifen = new Reifen_Übung(reifenMarke, reifenTyp);
    }

    public void ausgabeDaten()
    {
        System.out.println("Automarke: "+this.autoMarke +"ReifenTyp: "+this.reifen.reifenMarke);
    }
}
