package Cours5;
import java.util.Scanner;

public class ExerciceBoucles1 {
    public static void main (String args [])
    {
       //DEBUT
        System.out.println("+++++++++Bonjour++++++++ ");
        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez entrer le nombres de notes :");
        int nombreDeNotes = clavier.nextInt();
        double somme =0;
        System.out.println("Vous avez saisi : " + nombreDeNotes);
        //----------------
        for (int i = 0; i < nombreDeNotes; i++)
        {
            System.out.print("Veuillez saisir la note " + i + " :" );
            somme = somme + clavier.nextInt();
        }
        System.out.println("La somme : " + somme);
        System.out.println("La moyenne " + somme / nombreDeNotes);

/*
+++++++++Bonjour++++++++
Veuillez entrer le nombres de notes :3
Vous avez saisi : 3
Veuillez saisir la note 0 :1
Veuillez saisir la note 1 :2
Veuillez saisir la note 2 :1
La somme : 4.0
La moyenne 1.3333333333333333
 */



      //FIN
    }

}// fin class