package Cours5;
import java.util.Scanner;

public class ExempleWhileDo8 {
    public static void main (String args [])
    {
        int nombre ;
        boolean valeur ;
        Scanner clavier = new Scanner (System.in);
        do
        {
            valeur=false; // vaut true si le nombre n’est pas entre 10 et 100
            System.out.print (" Entrez un nombre compris entre 10 et 100 : ");
            nombre  =clavier.nextInt() ;
            //if( nombre > 10 && nombre < 100) // val valide
            if (nombre < 10 || nombre > 100)  //val non valide
            {
                valeur=true ;
                System.out.println(" le nombre doit être compris entre 10 et 100 !, ré entrez un nombre"  )   ;
            }
        } while (valeur); // pas besoin d’écrire  while (valeur == true)  ;
    }

}// fin class