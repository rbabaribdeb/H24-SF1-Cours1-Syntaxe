package Cours7;

public class ExempleMultiplication {
    public static void main(String[] args) {
        //DEBUT
        int x = 128;
        int y = 98;
        int produit = 0;
        // Boucle for : quand on connait le début et la fin
        for (int i = 0; i < y; i++)
        {
            produit = produit + x;
        }
        System.out.println("produit : " + produit);


        //FIN
    }

}
