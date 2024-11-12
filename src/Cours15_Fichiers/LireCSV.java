package Cours15_Fichiers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LireCSV {
    public static void main(String[] args) throws IOException {
        // Le chemin du fichier CSV
        String fichierCSV = "./src/Cours15_Fichiers/fichier2.csv";

        // Créer un objet BufferedReader pour lire le fichier
        BufferedReader br = new BufferedReader(new FileReader(fichierCSV));

        String ligne;

        // Lire chaque ligne du fichier
        while ((ligne = br.readLine()) != null) {
            // Diviser la ligne en fonction des virgules (le séparateur CSV standard)
            String[] colonnes = ligne.split(",");

            // Afficher les colonnes de la ligne
            for (String colonne : colonnes) {
                System.out.print(colonne + " ");
            }
            System.out.println(); // Sauter à la ligne suivante
        }

        // Fermer le BufferedReader
        br.close();
    }
}
