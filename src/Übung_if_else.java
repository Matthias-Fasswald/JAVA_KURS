import java.util.Scanner;

public class Übung_if_else
{
    public static void main(String[] args)
    {
        System.out.println("Wie viele Bundesländer hat Österreich?");
        System.out.println("15 || 3 || 9 || 7");


        Scanner scan = new Scanner(System.in);
        int inputUser = scan.nextInt();

        if(inputUser == 15)
        {
            System.out.println("FALSCH!!!");
        }
        else if(inputUser == 3)
            System.out.println("FALSCH!!!");
        else if(inputUser == 9)
            System.out.println("Richtig!!!");
        else if(inputUser == 7)
            System.out.println("FALSCH!!!");
        else if(inputUser != 15 || inputUser != 3 || inputUser != 9 || inputUser != 7)
            System.out.println("FALSCH!!!");



    }
}
