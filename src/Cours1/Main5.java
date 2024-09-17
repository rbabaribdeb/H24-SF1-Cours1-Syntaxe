package Cours1;
// 5 Ecrire un programme qui crée un variable var1 et var2 de type int
// iniitialisés respectivement avec les valeurs 5 et 13
// Créer une troisieme variable somme de type double
// calculer puis afficher cette somme

public class Main5 {
    public static void main(String[] args) {
// DEBUT
     // Déclarations des variables & constantes
     int var1;
     int var2;
     double somme; // 1- declaration

    // Algorithme

        var1 = 5;
        var2 = 13;
        somme = 0; // 2- initialisation de la variable
        somme = var1 + var2; // 3- affectation
        System.out.println(somme);
//FIN
    }
}