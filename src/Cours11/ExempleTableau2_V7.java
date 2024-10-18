package Cours11;

import java.util.Scanner;

public class ExempleTableau2_V7 { // calcul du max
    public static void main(String[] args) {
        // Demander de saisir n ou 5 valeurs(notes) int
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir la taille n du tableau : ");
        int n = sc.nextInt();

        int [] notes = new int[n];// tableau de 5 int

        for (int i = 0; i < notes.length; i++)
        {
            System.out.print("saisir note "+i +" : ");
            notes[i] = sc.nextInt();
        }

        // Afficher ces valeurs
        System.out.print("notes = {");
        for (int i = 0; i < notes.length-1; i++)
        {
            System.out.print(notes[i] + ", ");
        }
        System.out.println(notes[notes.length-1] + "}");
        // Calculer la somme et la moyenne

        double somme = 0;
        double moyenne = 0;

        for (int i = 0; i < notes.length; i++)
        {
            somme = somme + notes[i];
        }
        moyenne = somme / notes.length;
        System.out.println("somme = " + somme + " moyenne = " + moyenne);

        // calcul du max ?
        double max = notes[0];
        for (int i = 1; i < notes.length; i++)
        {
            if (notes[i] > max)
            {
                max = notes[i];
            }
        }
        System.out.println("max = " + max);




    }
}
