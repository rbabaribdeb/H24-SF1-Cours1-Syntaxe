package Cours12_Exercices_Tableaux;

public class Exercice2 {
    public static void main(String[] args) {
        // remplacer les val supperieures à 10 par zéro

        int[] tab1 = {0,2,5,55,26,2,57,4,1,5,5,4,6,64,0,0,0,0,0,1,2,2};
        //Affichage avant
        System.out.print("tabAvant = {");
        for (int i = 0; i < tab1.length-1; i++)
        {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println(tab1[tab1.length-1] + "}");

        // remplacer val
        for (int i = 0; i < tab1.length; i++)
        {
            if (tab1[i] > 10)
            {
                tab1[i] = 0;
            }
        }
        //Affichage Apres
        System.out.print("tabApres = {");
        for (int i = 0; i < tab1.length-1; i++)
        {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println(tab1[tab1.length-1] + "}");

    }
}
