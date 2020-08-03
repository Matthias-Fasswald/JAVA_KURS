public class MacBook_OOP extends Laptop_OOP
{
    boolean touchbar;

    public MacBook_OOP(int ram, double preis, String cpu,  boolean touchbar)
    {
        super("MacBook", "A10_Bionic", 16, 1600);
        this.touchbar = touchbar;
    }

    @Override
    public void starten() {
       // super.starten();
        System.out.println("MacBook gestartet!!!");
    }
}
