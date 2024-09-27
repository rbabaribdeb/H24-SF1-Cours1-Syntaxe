import java.util.Scanner;
public class ExempleMenu1 {

    // Codes de couleur ANSI
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println(BLUE + "=== Menu ===" + RESET);
            System.out.println(GREEN + "1. Option 1" + RESET);
            System.out.println(GREEN + "2. Option 2" + RESET);
            System.out.println(GREEN + "3. Option 3" + RESET);
            System.out.println(RED + "0. Quitter" + RESET);
            System.out.print(YELLOW + "Entrez votre choix: " + RESET);

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println(GREEN + "Vous avez choisi l'Option 1." + RESET);

                    break;
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
