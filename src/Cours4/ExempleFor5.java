package Cours4;

public class ExempleFor5 {
    public static void main(String[] args) {
        String chaine = "HOTEL*";
        // Debut
        System.out.println("0-" + chaine.charAt(0));
        System.out.println("1-" + chaine.charAt(1));
        System.out.println("2-" + chaine.charAt(2));
        System.out.println("3-" + chaine.charAt(3));
        // Fin
        System.out.println("4-" + chaine.charAt(4));

        int taille = chaine.length(); // 5
        System.out.println("Derniere-" + chaine.charAt(taille-1));

    }
}
/*
0-H
1-O
2-T
3-E
4-L
Derniere-*
 */