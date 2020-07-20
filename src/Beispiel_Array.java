import java.util.Scanner;

public class Beispiel_Array
{
    public static void main(String[]args)
    {
        int [] lottoZahlen = new int[6];
        for(int i = 0; i < lottoZahlen.length; i++)
        {
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            lottoZahlen[i] = userInput;

        }
        for(int i = 0; i < lottoZahlen.length; i++ )
        {
            System.out.println(lottoZahlen[i]);
        }
    }
}
