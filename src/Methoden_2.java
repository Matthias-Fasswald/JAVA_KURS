public class Methoden_2
{
    public static void main(String[]args)
    {
        createEnemy("Fiora", 100);
        createEnemy("Olaf", 80);
    }

/*    public static void createEnemy()
    {
        String Name = "Olaf";
        int Leben = 100;
        System.out.println("Enemy Created");
    }
*/


    public static void createEnemy(String name, int healtPoints)
    {
        String enemyName = name;
        int enemyHealth = healtPoints;
        System.out.println("enemy created "+name + " health "+healtPoints);
    }



}

