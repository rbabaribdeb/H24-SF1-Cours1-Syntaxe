package Cours11;

import java.util.Scanner;

public class ExempleTableau2_V2 { // On utilise des tableau à la place
    public static void main(String[] args) {
        // Demander de saisir n ou 5 valeurs(notes) int
        Scanner sc = new Scanner(System.in);
        int [] notes = new int[5];// tableau de 5 int
        System.out.print("saisir note 0 : ");
        notes[0] = sc.nextInt();

        System.out.print("saisir note 1 : ");
        notes[1] = sc.nextInt();

        System.out.print("saisir note 2 : ");
        notes[2]= sc.nextInt();

        System.out.print("saisir note 3 : ");
        notes[3] = sc.nextInt();

        System.out.print("saisir note 4 : ");
        notes[4] = sc.nextInt();



        //Mettre les valeurs dans un tableau
        // Afficher ces valeurs
        // Calculer la somme et la moyenne

    }
}
