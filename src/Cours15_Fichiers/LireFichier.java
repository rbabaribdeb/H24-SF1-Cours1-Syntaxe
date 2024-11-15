package Cours15_Fichiers;

import java.io.*;
public class LireFichier
{
    public static void main(String[] args) throws Exception {

    String sLigne ="";
    BufferedReader FichierEntree = new BufferedReader(new FileReader("./src/Test.txt"));
    while (sLigne != null)
    {
        sLigne = FichierEntree.readLine();
        System.out.println(sLigne);
    }
    FichierEntree.close();
    }
}
