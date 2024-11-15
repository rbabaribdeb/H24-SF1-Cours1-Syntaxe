package Cours15_Fichiers;
import java.io.*;

public class EcrireFichier {
    public static void main(String[] args) throws Exception{

        //Mode d'ouverture en écriture
        //Ouverture du fichier Test.txt associé à l'objet EcrireF
        PrintWriter EcrireF = new PrintWriter(new FileOutputStream("./src/Test.txt"));

        EcrireF.println(5);
        EcrireF.print("Nombre interessant:");
        EcrireF.print(' ');
        EcrireF.println(Math.PI);
        EcrireF.close();//Fermeture du fichier
         }
    }