package z_AideTp;

import java.util.Scanner;
public class ExempleMenu2 {

    // Codes de couleur ANSI
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static final String MENU1 =
            BLUE  + "┌─────────────────────────┐" + RESET + "\n" +
            BLUE  + "│       MENU PRINCIPAL    │" + RESET+ "\n" +
            BLUE  + "├─────────────────────────┤" + RESET+ "\n" +
            GREEN + "│ 1. Option 1             │" + RESET+ "\n" +
            GREEN + "│ 2. Option 2             │" + RESET+ "\n" +
            GREEN + "│ 3. Option 3             │" + RESET+ "\n" +
            RED   + "│ 0. Quitter              │" + RESET+ "\n" +
            BLUE  + "└─────────────────────────┘" + RESET+ "\n" +
            YELLOW + "Entrez votre choix: " + RESET;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println(MENU1);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println(GREEN + "Vous avez choisi l'Option 1." + RESET);
                    // Sous-menu pour Option 1
                    int sousChoix;
                    do {
                        System.out.println(BLUE  + "┌─────────────────────────┐" + RESET);
                        System.out.println(BLUE  + "│   SOUS-MENU OPTION 1    │" + RESET);
                        System.out.println(BLUE  + "├─────────────────────────┤" + RESET);
                        System.out.println(GREEN + "│ A. Choix A              │" + RESET);
                        System.out.println(GREEN + "│ B. Choix B              │" + RESET);
                        System.out.println(GREEN + "│ C. Choix C              │" + RESET);
                        System.out.println(RED   + "│ Q. Retourner            │" + RESET);
                        System.out.println(BLUE  + "└─────────────────────────┘" + RESET);
                        System.out.print(YELLOW + "Entrez votre choix: " + RESET);


                        String input = scanner.next();
                        sousChoix = input.toUpperCase().charAt(0); // Convertir en majuscule

                        switch (sousChoix) {
                            case 'A':
                                System.out.println(GREEN + "Vous avez choisi Choix A." + RESET);
                                break;
                            case 'B':
                                System.out.println(GREEN + "Vous avez choisi Choix B." + RESET);
                                break;
                            case 'C':
                                System.out.println(GREEN + "Vous avez choisi Choix C." + RESET);
                                break;
                            case 'Q':
                                System.out.println(YELLOW + "Retour au menu principal." + RESET);
                                break;
                            default:
                                System.out.println(RED + "Choix invalide, veuillez réessayer." + RESET);
                        }
                        System.out.println(); // Ligne vide pour la clarté
                    } while (sousChoix != 'Q');

                    break;
                    //-----------------------------------------------------------------------------
                case 2:
                    System.out.println(GREEN + "Vous avez choisi l'Option 2." + RESET);
                    break;
                case 3:
                    System.out.println(GREEN + "Vous avez choisi l'Option 3." + RESET);
                    break;
                case 0:
                    System.out.println(RED + "Au revoir !" + RESET);
                    break;
                default:
                    System.out.println(RED + "Choix invalide, veuillez réessayer." + RESET);
            }
            System.out.println(); // Ligne vide pour la clarté
        } while (choix != 0);

        scanner.close();
    }
}
