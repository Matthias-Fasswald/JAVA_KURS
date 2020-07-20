import java.util.Scanner;

public class EInlesen_3
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        String name =  scanner.nextLine();
        char geschlecht = scanner.next().charAt(0);
        int age = scanner.nextInt();
        long mobileNumber = scanner.nextLong();

        scanner.close();

        System.out.println("Name: "+name);
        System.out.println("Geschlecht: "+geschlecht);
        System.out.println("Age: "+age);
        System.out.println("TelNr: "+mobileNumber);

    }
}
