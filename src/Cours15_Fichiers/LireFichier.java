package Cours15_Fichiers;

import java.io.*;
public class LireFichier
{
    public static void main(String[] args) throws Exception {

    String ligne ="";
    BufferedReader FichierEntree = new BufferedReader(new FileReader("./src/Test.txt"));
    while (ligne != null)
    {
        ligne = FichierEntree.readLine();
        System.out.println(ligne);
    }
    FichierEntree.close();
    }
}
