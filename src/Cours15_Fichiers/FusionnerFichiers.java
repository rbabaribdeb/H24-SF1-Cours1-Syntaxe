package Cours15_Fichiers;

import java.io.*;

public class FusionnerFichiers {
    public static void main(String[] args) throws IOException {
        // Chemins des fichiers à fusionner
        String fichier1 = "fichier1.txt";
        String fichier2 = "fichier2.txt";
        String fichierFusionne = "fichier_fusionne.txt";

        // Appel de la méthode pour fusionner les fichiers
        fusionnerFichiers(fichier1, fichier2, fichierFusionne);
        System.out.println("Fusion des fichiers réussie !");
    }

    public static void fusionnerFichiers(String fichier1, String fichier2, String fichierFusionne) throws IOException {
        // Création des flux de lecture pour les fichiers source
        BufferedReader reader1 = new BufferedReader(new FileReader(fichier1));
        BufferedReader reader2 = new BufferedReader(new FileReader(fichier2));

        // Création du flux de sortie pour le fichier fusionné
        BufferedWriter writer = new BufferedWriter(new FileWriter(fichierFusionne));

        // Lecture et écriture du contenu du premier fichier
        String line;
        while ((line = reader1.readLine()) != null) {
            writer.write(line);
            writer.newLine(); // Ajouter une nouvelle ligne après chaque ligne du fichier
        }

        // Lecture et écriture du contenu du second fichier
        while ((line = reader2.readLine()) != null) {
            writer.write(line);
            writer.newLine(); // Ajouter une nouvelle ligne après chaque ligne du fichier
        }

        // Fermeture des flux
        reader1.close();
        reader2.close();
        writer.close();
    }
}

