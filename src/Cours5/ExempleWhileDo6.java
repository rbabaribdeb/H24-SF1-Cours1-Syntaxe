package Cours5;
import java.util.Scanner;
public class ExempleWhileDo6 {
    public static void main(String[] args) {
        //DEBUT
        char cReponse;
        Scanner clavier = new Scanner(System.in);
        do
        {
            System.out.print("Q pour quitter | autre pour recommancer ... :  ");
            cReponse = clavier.nextLine().charAt(0);
        }while (cReponse != 'q' && cReponse != 'Q');
        System.out.println("Vous avez quitté : " + cReponse);
       //FIN
    }// fin main
}// fin class