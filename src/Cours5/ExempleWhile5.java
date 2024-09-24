package Cours5;

import java.util.Scanner;

public class ExempleWhile5 {
    public static void main(String[] args) {
        //DEBUT
        char cReponse;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Q pour quitter | autre pour recommancer ... :  ");

        String saisie = clavier.nextLine();
        cReponse = saisie.charAt(0);
        //cReponse = clavier.nextLine().charAt(0); equivalent en une seule ligne
        //equivalent à while (!(cReponse == 'q' || cReponse == 'Q'))

        while (cReponse != 'q' && cReponse != 'Q')

        {
            System.out.print("Q pour quitter | autre pour recommancer ... :  ");
            cReponse = clavier.nextLine().charAt(0);
        }
        System.out.println("Vous avez quitté : " + cReponse);


       //FIN
    }// fin main
}// fin class
