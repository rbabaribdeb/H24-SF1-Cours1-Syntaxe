import java.util.Scanner;

public class MainExempleCharDirection {

    public static void main(String[] args) {
        //DÉBUT
        char cDirection;
        String chaine;
        //---------------------------------
        // Saisir
        Scanner clavier = new Scanner(System.in);
        System.out.println("Donner la direction: d g h b : ");
        chaine = clavier.nextLine();
        System.out.println("vous avez saisis : " + chaine);
        System.out.println("La premiere lettre est " + chaine.charAt(0));
        cDirection = chaine.charAt(0);

        if (cDirection == 'd')
        {
            System.out.println("droite ");
        } else if (cDirection == 'g') {
            System.out.println("gauche");
        }
        else if (cDirection == 'h') {
            System.out.println("haut");
        }
        else if (cDirection == 'b') {
            System.out.println("bas");
        }else
        {
            System.out.println("Erreur : ce n'est pas une direction");
        }


        //FIN
    }
}
