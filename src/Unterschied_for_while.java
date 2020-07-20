import java.util.Scanner;

public class Unterschied_for_while
{
    public static void main(String[]args)
    {



        Scanner scan = new Scanner(System.in);
        System.out.println("1?\n2?");

        int userInput = scan.nextInt();
        int anzahlGegner = 0;
        if(userInput == 1) {
            anzahlGegner = 10;
        }
        else if(userInput == 2)
        {
            anzahlGegner = 15;
        }

        while(anzahlGegner != 0)
        {
            System.out.println("Gegner erstellt!");
            anzahlGegner--;
        }
    }

}
