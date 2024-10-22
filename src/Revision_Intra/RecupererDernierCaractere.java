package Revision_Intra;

import java.util.Scanner;

public class RecupererDernierCaractere {
    public static void main(String[] args) {
        // RecupererDernier caractere

        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir un entier : ");
        String chaine = sc.nextLine();
        char dernierChar =chaine.charAt(chaine.length()-1);
        System.out.print("Le dernier caractere est :  " + dernierChar);

    }


}
