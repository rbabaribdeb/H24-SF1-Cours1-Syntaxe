package Cours15_Fichiers;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EcrireTabDansFichierV1 {
    public static void main(String[] args) throws Exception
    {

        int [] tab = {1,2,3,4,5,6,7,8,9,10};
        PrintWriter EcrireF = new PrintWriter(new FileOutputStream("./src/Test.txt"));

        for(int i=0; i<tab.length; i++) {
            EcrireF.println(tab[i]);
        }
    EcrireF.close();
    }
}