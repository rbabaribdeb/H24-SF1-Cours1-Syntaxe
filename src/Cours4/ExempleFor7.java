package Cours4;

public class ExempleFor7 {
    public static void main(String[] args) {
        // Accumulation...
        // Somme = 1 +2 + 3 + 4 + 5 ....+ 99 + 100
        // Produit = 1 x 2 x 3x ... x 100
        int somme = 0 ;
        double produit = 1;
        for (int i = 0; i <= 10; i++) {
            somme = somme + i;
        }

        System.out.println("somme = " + somme);

        for (int i = 1; i <= 10; i++) {
            produit = produit * i;
        }

        System.out.println("produit = " + produit);
    } // fin main

} // fin class
