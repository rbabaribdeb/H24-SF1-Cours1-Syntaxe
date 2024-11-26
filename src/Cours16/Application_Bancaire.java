package Cours16;
import java.io.*;
/**
 * @Author : nabila azi
 * @
 */
public class Application_Bancaire {
    public static void main(String[] args) throws Exception
    {
        //1- déclarer le fichier et ouvrir le fichier en lecture
         BufferedReader fichier = new BufferedReader(new FileReader("transactions.txt"));
        // 2-appeler la méthode calculer SoldeFinal et afficher le solde final

         System.out.println("Le solde final du compte est " + calculerSoldeFinal(fichier) );
         extraire("depots.txt", 1); //choix = 1 pour les dépots
         extraire("retraits.txt", 2); //choix= 2 pour les retraits
    }

    private static void extraire(String nomFichier, int choix) throws Exception {
        PrintWriter fichier = new PrintWriter(new FileWriter(nomFichier));
        BufferedReader transact = new BufferedReader(new FileReader("transactions.txt"));
        String ligne;
        if (choix == 1) { //je traite les dépots seulement
            while ((ligne = transact.readLine()) != null) {
                if (ligne.charAt(0) != '-') {
                    fichier.println(ligne); }
            }
        } else
        {
            //je traite les retraits
            while ((ligne = transact.readLine()) != null)
            {
                if (ligne.charAt(0) == '-')
                {
                    fichier.println(ligne);}
            }
        }
        transact.close();
        fichier.close(); //important
    }
    private static int calculerSoldeFinal(BufferedReader file) throws Exception
    {
        String ligne;
        int soldeFinal = 0;
        while ((ligne = file.readLine()) != null)
        {
        soldeFinal = soldeFinal + Integer.parseInt(ligne); //convertir un string en int
        // ou bien Double.parseDouble (ligne) si les montants d'argent sont des double
        }
        file.close();
        return soldeFinal;
        }
    }