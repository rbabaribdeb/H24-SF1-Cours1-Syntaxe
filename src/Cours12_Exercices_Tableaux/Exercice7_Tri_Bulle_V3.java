package Cours12_Exercices_Tableaux;

public class Exercice7_Tri_Bulle_V3 {

    public static void main(String[] args) {

        int[] tab1 = {0, 2, 5, 55, 26, 2, 57, 4, 1, 5, 5, 4, 6, 64, 0, 0, 0, 0, 0, 1, 222, -2};

        //Affichage Avant
        System.out.print("tabAvantTri = {");
        for (int i = 0; i < tab1.length - 1; i++) {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println(tab1[tab1.length - 1] + "}");
        //-------------
        int temporire = 0;
        int i =0 ;
        int compteurDeNombreDejaTrie = 0;
        // Tri à bulle avec une seule boucle while Merci Mounib.B

        while (compteurDeNombreDejaTrie != tab1.length - 2 )
        {
            if (tab1[i] > tab1[i + 1])
            {//Echanger
                temporire = tab1[i];
                tab1[i] = tab1[i + 1];
                tab1[i + 1] = temporire;
            }else
            {
                compteurDeNombreDejaTrie++;
            }
            i = (i + 1) % (tab1.length - 1 );

            if(i == 0) compteurDeNombreDejaTrie = 0;
        }
        //---------------    Affichage Apres
        System.out.print("tabApresTri = {");

        for (i = 0; i < tab1.length-1; i++)
        {
            System.out.print(tab1[i] + ", ");
        }
        System.out.println(tab1[tab1.length-1] + "}");

    }
}
