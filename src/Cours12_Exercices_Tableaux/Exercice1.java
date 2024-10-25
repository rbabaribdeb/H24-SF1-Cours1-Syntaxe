package Cours12_Exercices_Tableaux;

public class Exercice1 {
    public static void main(String[] args) {
        // nombre de zero rt nombre de chiffres pair

        int[] tab1 = {0,2,5,5,2,2,5,4,1,5,5,4,6,64,0,0,0,0,0,1,2,2};
        int[] tab2 = new int[tab1.length]; // tableau avec la meme taille que tab 1

        System.out.println("Taille :" + tab1.length);
        System.out.println("premiere case : " + tab1[0]);
        System.out.println("derniere case : " + tab1[tab1.length-1]);
        int compteurDeZeros = 0;
        for (int i = 0; i < tab1.length; i++)
        {
            System.out.println("tab1[" + i + "] : " + tab1[i]);
            if (tab1[i] == 0)
            {
                compteurDeZeros ++; // compteurDeZeros =compteurDeZeros +1
            }
        }
        System.out.println("compteur zero " + compteurDeZeros);
        //---
        int compteurDePair = 0;
        for (int i = 0; i < tab1.length; i++)
        {
            if (tab1[i]%2 == 0)
            {
                System.out.println("p tab1[" + i + "] : " + tab1[i]);
                compteurDePair ++; //
            }
        }
        System.out.println("compteurDePair :  " + compteurDePair);
    }
}
