import java.util.Scanner;

public class Switch_Case_Abfrage2
{
    public static void main(String[]args)
    {
        System.out.println("Wie viele Bundesländer hat Östereich?");
        System.out.println("15 || 9 || 7 || 3");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch (input)
        {
            case 15:
                System.out.println("Falsch !!!");
                break;

            case 9:
                System.out.println("RICHTIG !!!");
                break;


            case 7:
                System.out.println("Falsch !!!");
                break;

            case 3:
                System.out.println("Idiot !!!");
                break;
            default:
                System.out.println("Falsch !!!");
        }
    }
}
