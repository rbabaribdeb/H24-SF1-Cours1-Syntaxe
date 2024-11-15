package Cours15_Fichiers;
import java.io.*;

public class EcrireFichier {
    public static void main(String[] args) throws Exception{

        //Mode d'ouverture en écriture
        //Ouverture du fichier Test.txt associé à l'objet FichierSortie
        PrintWriter FichierSortie = new PrintWriter(new FileOutputStream("./src/Test.txt"));

        FichierSortie.println(5);
        FichierSortie.print("Nombre interessant:");
        FichierSortie.print(' ');
        FichierSortie.println(Math.PI);
        FichierSortie.close();//Fermeture du fichier
         }
    }