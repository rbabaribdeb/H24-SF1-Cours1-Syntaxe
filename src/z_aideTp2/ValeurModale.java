package z_aideTp2;


public class ValeurModale {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 2, 3, 4, 5, 6, 6,6,6,6,6,66,6};

        // Calcul de la valeur modale
        System.out.println("La valeur modale est : " + trouverMode(tableau));
    }

    public static int trouverMode(int[] tableau) {
        // Tableau pour stocker la fréquence de chaque élément
        int[] frequences = new int[tableau.length];

        // Compter la fréquence de chaque élément
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i] == tableau[j]) {
                    frequences[i]++;
                }
            }
        }

        // Trouver l'élément avec la fréquence maximale
        int mode = tableau[0];
        int maxFrequency = 0;

        // Comparer les fréquences
        for (int i = 0; i < tableau.length; i++) {
            if (frequences[i] > maxFrequency) {
                maxFrequency = frequences[i];
                mode = tableau[i];
            }
        }

        return mode;
    }
}



