package Cours15_Fichiers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EcrireCSV {
    public static void main(String[] args) throws IOException {
        // Tableau de données à écrire dans le fichier CSV
        // Un tableau peut contenir d'auters tableaux
        String[][] tableau = {
                {"Nom", "Prénom", "Âge"},
                {"Dupont", "Jean", "30"},
                {"Martin", "Claire", "25"},
                {"Durand", "Paul", "40"}
        };

        // Chemin du fichier CSV où les données seront écrites
        String fichierCSV = "./src/Cours15_Fichiers/fichier2.csv";

        // Créer un BufferedWriter pour écrire dans le fichier
        BufferedWriter bw = new BufferedWriter(new FileWriter(fichierCSV));

        // Parcourir chaque ligne du tableau
        for (String[] ligne : tableau) {
            // Envelopper chaque valeur avec des guillemets pour gérer les virgules
            for (int i = 0; i < ligne.length; i++) {
                ligne[i] = "\"" + ligne[i].replace("\"", "\"\"") + "\"";  // Échapper les guillemets
            }

            // Joindre les éléments de la ligne avec une virgule
            String ligneCSV = String.join(",", ligne);

            // Écrire la ligne dans le fichier
            bw.write(ligneCSV);

            // Ajouter une nouvelle ligne (saut de ligne)
            bw.newLine();
        }

        // Fermer le BufferedWriter après avoir écrit dans le fichier
        bw.close();
    }
}
