public class Array
{
    public static void main(String[]args)
    {

        int zahl = 50;
        float zahl1 = 34.34f;
        int [] zahlArray = new int[7];
        zahlArray[0] = 50;
        zahlArray[1] = 500;
        /*
        .
        .
        .
         */
        zahlArray[6] = 12;


        float [] zahlenArray1 = new float[7]; // erstellt nur das Array
        zahlenArray1[0] = 34.23f;
        zahlenArray1[1] = 50.45f;
        /*
        .
        .
        .
         */
        zahlenArray1[6] = 5.45f;

        String [] personA = {"Olaf", "Müller","35"};
        System.out.println("Vorname: "+personA[0]);
    }
}
