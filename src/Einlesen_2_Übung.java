import java.util.Scanner;

public class Einlesen_2_Übung
{
    public static void main(String[]args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib dein Alter und deinen Namen ein: ");
        int alter = scan.nextInt();
        String name = scan.next();
        System.out.println("Dein Alter: "+alter +" Dein Name: "+name);
        
    }
}
