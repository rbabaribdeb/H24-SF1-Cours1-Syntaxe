package Cours9;

import java.util.Scanner;

public class ExempleSaisie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean estValide = false;
        do {
            //----------------
            System.out.println("Saisir un choix ou letrte ...");
            String choix = sc.nextLine();
            //------TEST choix Valide
            boolean tailleSaisieValide = false;
            if (choix.length() > 1) {
                System.out.println("Trop long .... ");
            } else if (choix.length() < 1) {
                System.out.println("Chainne vide .... ");
            } else {
                char cSaisie = choix.charAt(0);///---- Ligne a problème dans le cas d'une saisie d'une ligne vide
                choix = String.valueOf(cSaisie);
                tailleSaisieValide = true;
            }

            //------Test nombre
            String chaineDeChoixValides = "1234567abcdefgABCDEFG0qQ";
            boolean choixSaisieValide = false;
            if (chaineDeChoixValides.indexOf(choix) == -1) {
                System.out.println("Saisie invalide");
            } else {
                System.out.println("Saisie valide");
                choixSaisieValide = true;
            }

             estValide = choixSaisieValide && tailleSaisieValide;
            //boolean estNonValide = !choixSaisieValide || !tailleSaisieValide;
            // (estValide == ! estNonValide)  est tjs true
            // !(A ET B) = !A OU !B

            System.out.println("est valide : " + estValide);
            //---------------------
        }while (!estValide);
    }
}
