package z_aideTp2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static Cours14.Exemple2.afficheTab;

public class LireVersTabV1
{
    public static int nbrLignes() throws IOException {
        String ligne ="";
        int nombreLignes = 0;
        BufferedReader FichierEntree = new BufferedReader(new FileReader("./src/Test.txt"));
        while (ligne != null)
        {
            ligne = FichierEntree.readLine();
            nombreLignes++;
        }
        FichierEntree.close();
        return nombreLignes - 1;
    }

    public static int [] lireVersTab() throws IOException {
        String ligne ="";
        int [] tab = new int[nbrLignes()];

        BufferedReader FichierEntree = new BufferedReader(new FileReader("./src/Test.txt"));
       for (int i = 0; i < tab.length; i++)
        {
            tab[i] = Integer.parseInt(FichierEntree.readLine());
        }
        FichierEntree.close();
        return  tab;
    }

    public static void main(String[] args) throws Exception
    {
      //  System.out.println("nbr lignes : " + nbrLignes());
        int [] tab = lireVersTab();
        afficheTab(tab);
    }
}