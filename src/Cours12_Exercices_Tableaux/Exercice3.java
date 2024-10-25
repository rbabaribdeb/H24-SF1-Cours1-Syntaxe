package Cours12_Exercices_Tableaux;

public class Exercice3 {
    public static void main(String[] args) {

        int[] tab1 = {0,2,5,55,26,2,57,4,1,5,5,4};

        // afficher le tableau
        for (int i = 0; i < tab1.length; i++)
        {
            System.out.println("+ tab1["+i+"] = " + tab1[i]);
        }
        int ii =0;
        // afficher le tableau inversé
        for (int i = 0; i < tab1.length; i++)
        {
            ii = tab1.length - i - 1 ;
            System.out.println("- tab1["+ii+"] = " + tab1[ii]);
        }
        // Afficher les valeurs dont les indices sont pair
        for (int i = 0; i < tab1.length; i++)
        {
            if (i % 2 == 0) {
                System.out.println("** tab1[" + i + "] = " + tab1[i]);
            }
        }
        // Afficher les valeurs dont les indices sont pair
        for (int i = 0; i < tab1.length; i++)
        {
            if (i % 2 == 1) {
                System.out.println("* tab1[" + i + "] = " + tab1[i]);
            }
        }



    }
}
