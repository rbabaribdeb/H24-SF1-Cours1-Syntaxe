package Cours8;

public class ExempleString2 {
    public static void main(String[] args) {

        // Convertion de types
        String chaine1 = "Bonjour ";
        // String chaine2 = 3; // marche pas
        String chaine2 = Integer.toString(3); // concatene avec un int
        System.out.println(chaine2);

        boolean estVrai = true;
        String chaine3 = "LE resultat est : " + estVrai;
        String chaine4 = "LE resultat est : " + Boolean.toString(estVrai);
        System.out.println(chaine3);
        System.out.println(chaine4);

        String chaine5 = "resultat est : " + 2.5;
        String chaine6 = "resultat est : " + Double.toString(2.6);
        System.out.println(chaine5);


        // Convertion depuis String : int val = 3, String chaine = "3"  , char char = '3'.
        String chaine7 = "3";
        // int nombre7 = chaine7 + 10 ; Erreur
        int nombre7 = Integer.parseInt(chaine7) + 10;
        System.out.println(nombre7);
        // convertir un char en int
        char val = '9';
        int nombre8 = Character.getNumericValue(val);
        System.out.println(nombre8);

        // convertir un char en string
        char val2 = 'A';
        String chaine9 = Character.toString(val2);
        System.out.println("chaine9 : " + chaine9);

        // un char peut etre converti en int
        int val3 = 'a';
        System.out.println("val3 : " + val3);

        char val4 = 65;
        System.out.println("val4 " + val4);

    }

}
