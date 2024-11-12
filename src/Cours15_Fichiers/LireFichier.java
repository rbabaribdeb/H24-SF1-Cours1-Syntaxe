package Cours15_Fichiers;

import java.io.*;
public class LireFichier
{public static void main(String[] args) throws
        Exception {
    BufferedReader FichierEntree;
    String sLigne;
    FichierEntree = new BufferedReader(new FileReader("./src/Test.txt"));
    while ((sLigne = FichierEntree.readLine()) != null)
        System.out.println(sLigne);
    FichierEntree.close();
}}
