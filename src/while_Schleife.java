public class while_Schleife
{
    public static void main(String[]args)
    {

        int count = 1;
        while(count != 6)
        {
            System.out.println("Ich bin: "+count);
            count++;

            if(count == 6)
            {
                System.out.println("jetzt reichts aber!!! "+count);
            }
        }
    }

}
