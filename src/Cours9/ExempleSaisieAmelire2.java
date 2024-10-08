package Cours9;

import java.util.Scanner;

public class ExempleSaisieAmelire2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaineDeChoixValides = "1234567abcdefgABCDEFG0qQ";
        boolean estValide = false;
        do {
            //----------------
            System.out.println("Saisir un choix ou letrte ... : ");
            String choix = sc.nextLine();
            estValide = (choix.length() == 1) && (chaineDeChoixValides.indexOf(choix) != -1);
            System.out.println("est valide : " + estValide);
            //---------------------
        }while (!estValide);
    }
}
