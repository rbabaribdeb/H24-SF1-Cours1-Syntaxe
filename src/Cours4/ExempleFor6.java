package Cours4;

public class ExempleFor6 {
    public static void main(String[] args) {
        String chaine = "HOTEL ***";
        // Debut
        for (int i = 0; i < chaine.length(); i++) {
            System.out.println(i+ "-" + chaine.charAt(i));
        }
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