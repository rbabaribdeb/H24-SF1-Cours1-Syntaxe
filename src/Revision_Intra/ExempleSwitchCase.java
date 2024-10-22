package Revision_Intra;

import java.util.Scanner;

public class ExempleSwitchCase {
    public static void main(String[] args) {
       // Utiliser break pour éviter l'exécution des case suivants.
       // Ne pas utiliser break si tu souhaites exécuter plusieurs blocs de code consécutivement.

        // Qu'affiche ce code pour les valeurs 1,2,3 et 4 ?

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entre 1 et 4 : ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Vous avez choisi le nombre un.");
                break; // Sortir après avoir exécuté ce case
            case 2:
                System.out.println("Vous avez choisi le nombre deux.");
                // Pas de break ici, donc le code continuera à s'exécuter
            case 3:
                System.out.println("Vous avez choisi le nombre trois.");
                break; // Sortir après avoir exécuté ce case
            case 4:
                System.out.println("Vous avez choisi le nombre quatre.");
                break; // Sortir après avoir exécuté ce case
            default:
                System.out.println("Nombre invalide, veuillez entrer un nombre entre 1 et 4.");
                break;
        }

        scanner.close();

    }
}
