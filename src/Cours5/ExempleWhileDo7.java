package Cours5;
import java.util.Scanner;

public class ExempleWhileDo7 {
    public static void main(String[] args) {
        //DEBUT
        int nombre ;
        Scanner clavier = new Scanner(System.in);
        do {
            System.out.print("Saisir un nombre : ");
            nombre = clavier.nextInt();
            if (nombre < 10 || nombre > 100)
            {
                System.out.println("Nombre invalide");
            }else
            {
                System.out.println("Nombre valide");
            }
        }while (nombre < 10 || nombre > 100);
        System.out.println("Le nombre est entre 10 et 100 : " + nombre);
       //FIN
    }// fin main
}// fin class