import java.util.Scanner;

public class MainExempleChar {

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
        System.out.println("La deuxieme lettre est " + chaine.charAt(1));
        System.out.println("La troisieme est "       + chaine.charAt(2));
        System.out.println("Votre chaine contien " + chaine.length() + " caracteres");
        System.out.println("Le dernier caractere est : " + chaine.charAt(chaine.length() - 1));

        //cDirection = chaine.charAt(0);







        //FIN
    }
}
