package Cours11;

import java.util.Scanner;

public class ExempleTableau2_V4 { // Demander de saiasir n la taille du tableau
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

     /*   System.out.print("saisir note 0 : ");
        notes[0] = sc.nextInt();

        System.out.print("saisir note 1 : ");
        notes[1] = sc.nextInt();

        System.out.print("saisir note 2 : ");
        notes[2]= sc.nextInt();

        System.out.print("saisir note 3 : ");
        notes[3] = sc.nextInt();

        System.out.print("saisir note 4 : ");
        notes[4] = sc.nextInt();
*/


        //Mettre les valeurs dans un tableau
        // Afficher ces valeurs
        // Calculer la somme et la moyenne

    }
}
