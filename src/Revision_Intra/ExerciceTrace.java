package Revision_Intra;

import java.util.Scanner;

public class ExerciceTrace {
    public static void main(String[] args) {
        /*
        Acumulateur S vs Compteur I
        S <-- 0
        I <-- 0
        LIRE J // saisir 2
        TANT QUE I < 4
            I <-- I+1
            S <-- S+J

        ECRIRE S
         */

        // 1- Ecrire en java
        // 2 - Faire la trace

        Scanner clavier= new Scanner(System.in);
        int i;
        int j;
        int s;
        s=0;
        i=0;
        j=clavier.nextInt();// saisir la valeur 2
        while (i < 4)
        {

            i=i+1; // compteur
            s=s+j; // accumulation
        }
        System.out.println(s);

    }
}
