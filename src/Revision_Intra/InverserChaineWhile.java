package Revision_Intra;

import java.util.Scanner;

public class InverserChaineWhile {
    public static void main(String[] args) {
        //----DEUBUT
        String chaine = "";
        String chaineInversee = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("saisir un mot : "); // Bonjour
        chaine = sc.nextLine();
        //-----
        // Ecrire une boucle for 6,5,4,3,2,1,0
       //  for (int i = 0; i < chaine.length(); i++) {}
        int i = 0;
        while (i < chaine.length())
        {
            chaineInversee = chaineInversee + chaine.charAt(chaine.length() -1 - i);
            i++;
        }
        System.out.println(chaineInversee);
        // FIN
    }
}
