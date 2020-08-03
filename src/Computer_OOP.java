public class Computer_OOP
{
    int preis;

    String cpu;
    Mainboard_OOP mainboard;

    public Computer_OOP()
    {

    }

    public Computer_OOP(String cpu, Mainboard_OOP mainboard, int preis)
    {
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.preis = preis;
    }

    public Computer_OOP(int ram, int gpuSlots, int usbPorts, String cpu)
    {
        mainboard = new Mainboard_OOP(ram, gpuSlots, usbPorts);
        this.cpu = cpu;
    }
}
