package Cours12_Exercices_Tableaux;

public class Exercice7_Tri_Bulle_V2 {

    public static void main(String[] args) {

        int[] tab1 = {0, 2, 5, 55, 26, 2, 57, 4, 1, 5, 5, 4, 6, 64, 0, 0, 0, 0, 0, 1, 222, -2};

        //Affichage Avant
        System.out.print("tabAvantTri = {");
        for (int i = 0; i < tab1.length - 1; i++) {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println(tab1[tab1.length - 1] + "}");

        int temporire = 0;
        boolean echange = true;
        while (echange == true)
        {
            echange = false;
            for (int i = 0; i < tab1.length - 1; i++)
            {
                if (tab1[i] > tab1[i + 1])
                {
                    //Echanger
                    temporire = tab1[i];
                    tab1[i] = tab1[i + 1];
                    tab1[i + 1] = temporire;
                    echange = true;
                }
            }
        }
        //---------------    Affichage Apres
        System.out.print("tabApresTri = {");
        for (int i = 0; i < tab1.length-1; i++)
        {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println(tab1[tab1.length-1] + "}");

    }
}
