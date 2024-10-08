package Cours9;

import java.util.Scanner;

public class ExempleSaisieAmelire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean estValide = false;
        do {
            //----------------
            System.out.println("Saisir un choix ou letrte ... : ");
            String choix = sc.nextLine();
            //------TEST choix Valide

            boolean tailleSaisieValide = choix.length() == 1;

            //------Test nombre
            String chaineDeChoixValides = "1234567abcdefgABCDEFG0qQ";
            boolean choixSaisieValide = chaineDeChoixValides.indexOf(choix) != -1;


            estValide = choixSaisieValide && tailleSaisieValide;


            System.out.println("est valide : " + estValide);
            //---------------------
        }while (!estValide);
    }
}
