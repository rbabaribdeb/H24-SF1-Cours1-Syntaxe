package Cours5;

import java.util.Scanner;

public class ExempleWhile4 {
    public static void main(String[] args) {
        //DEBUT
        int nombre;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nombre positif : ");
        nombre = clavier.nextInt();
        while (nombre <= 0)//{};
        {
            System.out.println("Nombre invalide : " + nombre);
            System.out.print("Svp vous devez entrer un nombre positif : ");
            nombre = clavier.nextInt();
        }
        System.out.println("Nombre valide " + nombre);
       //FIN
    }// fin main
}// fin class
