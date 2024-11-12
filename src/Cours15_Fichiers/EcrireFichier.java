package Cours15_Fichiers;

import java.io.*;
public class EcrireFichier {
    public static void main(String[] args) throws Exception{
//Déclarations
        String Nom;
        BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        PrintWriter FichierSortie;
//Mode d'ouverture en écriture
//Ouverture du fichier Test.txt associé au nom FichierSortie
        FichierSortie = new PrintWriter(new FileOutputStream("./src/Test.txt"));
        System.out.print ("Entrez votre nom : "); //Entrée du nom au clavier
        Nom=(stdin.readLine());

//Ecriture dans le fichier Test.txt, du nom et de quelques autres données
        FichierSortie.println("Identité =" + Nom);
        FichierSortie.println(5);
        FichierSortie.print("Nombre interessant:");
        FichierSortie.print(' ');
        FichierSortie.println(Math.PI);
        FichierSortie.close();//Fermeture du fichier
         }
    }