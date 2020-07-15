import java.util.Scanner;

public class Input_1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein: ");
        double zahl1 = scan.nextDouble();
        System.out.println("Das ist deine Zahl: "+zahl1);


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Name eingeben: ");
        String zeichenkette = scan2.next();
        System.out.println("Alter eingeben: ");
        int alter = scan2.nextInt();

        System.out.println("Ihr Name: "+zeichenkette + " Ihr Alter: "+alter);
    }

}
