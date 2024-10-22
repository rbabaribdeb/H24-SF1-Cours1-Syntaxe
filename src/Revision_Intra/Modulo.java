package Revision_Intra;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        // (%) Modulo est le reste de la division entiere (/)
        // saisir un entier au clavier, affichez le dernier
        // chiffre de ce nombre ex nombre =257, on affiche 7.
        Scanner sc = new Scanner(System.in);
        System.out.print("svp saisir un nombre entier : ");
        int nombre = sc.nextInt();
        int reste = nombre % 10;
        System.out.println("reste : " + reste);
        // Comment savoir si il est pair ou impair ?

        boolean estPair = (nombre % 2 == 0);
        System.out.println("le nombre " + nombre +" est pair : " + estPair);

        // Proposition intelligente par votre camarade : le faire en chaine de caractères




    }
}
