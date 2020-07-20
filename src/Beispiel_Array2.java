import java.util.Scanner;

public class Beispiel_Array2
{
    public static void main(String[]args)
    {
        String [] fragen = {"Wie viel ist 5 + 4", "Wie viel ist 3 * 5"};

        int [] antowrten = {9, 15};
        int count = 0;

        while(count < fragen.length)
        {
            System.out.println(fragen[count]);
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            if(userInput == antowrten[count])
            {
                System.out.println("Richtig");
                count++;
            }
            else
                System.out.println("Falsch");
        }
    }

}
