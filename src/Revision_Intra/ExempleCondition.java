package Revision_Intra;

import java.util.Scanner;

public class ExempleCondition {
    public static void main(String[] args) {
        // Qu'affiche ce code pour les valeurs -10, 10, 14, 18 et 24 ?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        if (age >= 0) {  // Vérifie si l'âge est valide
            if (age < 12) {
                System.out.println("Vous êtes un enfant.");
            } else if (age < 18) {
                System.out.println("Vous êtes un adolescent.");
            } else {
                System.out.println("Vous êtes un adulte.");
            }
        } else {
            System.out.println("Âge invalide.");
        }

        scanner.close();
    }
}
