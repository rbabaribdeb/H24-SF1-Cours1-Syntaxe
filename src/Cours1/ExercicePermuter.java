package Cours1;

import java.util.Scanner; // cherche la classe depuis la libraire
public class ExercicePermuter {
    public static void main(String[] args) {
// DEBUT
        Scanner clavier = new Scanner(System.in); // je crée un objet clavier
        //Variables :
        //ligne 1 : Type entier : a
        int a;
        //ligne 2 :Type entier : b
        int b;
        //ligne 3 :Type entier : temporaire = 0
        int temporaire = 0 ;
        //ligne 4 :AFFICHER « Svp saisissez un entier a : »
        System.out.println("Svp saisissez un entier a :");
        //ligne 5 :SAISIR a
        a = clavier.nextInt();

        //ligne 6 :AFFICHER « Svp saisissez un entier b : »
        System.out.println("Svp saisissez un entier b :");
        //ligne 7 :SAISIR b
        b = clavier.nextInt();

        //ligne 8 :AFFICHER « Avant permutation : »
        System.out.println("Avant permutation :");
        //ligne 9 :AFFICHER « a : » + a
        System.out.println("a : " + a);
        //ligne 10 :AFFICHER « b : » + b
        System.out.println("b : " + b);

        //ligne 11 : temproraire  a
        temporaire = a;
        //ligne 12 : A  b
        a=b;
        //ligne 13 :  B temporaire
        b=temporaire;

        //ligne 14 :AFFICHER « Avant permutation : »
        System.out.println("Avant permutation :");
        //ligne 15 :AFFICHER « a : » + a
        System.out.println("a : " + a);
        //ligne 16 :AFFICHER « b : » + b
        System.out.println("b : " + b);
        //FIN
    }
}
