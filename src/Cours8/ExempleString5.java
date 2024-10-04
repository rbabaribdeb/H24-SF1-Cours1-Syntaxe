package Cours8;

public class ExempleString5 {
    public static void main(String[] args) {
        // utilisation de substring

        String phrase = "Bon matin";

        // Afficher les caracter
        /*
        B
        o
        n

        m
        a
        t
        i
        n
         */

        for (int i = 0; i < phrase.length(); i++)
        {
            System.out.println(phrase.charAt(i));
        }
        // Inverser cet affichage
        for (int i= phrase.length() - 1 ; i >= 0; i--)
        {
            System.out.println(phrase.charAt(i));
        }


        // Inverser cet affichage ... Et plus ...
        for (int i= phrase.length() - 1 ; i >= 0; i--)
        {
            System.out.print(phrase.charAt(i));
            System.out.print(phrase.charAt(i));
            System.out.print(phrase.charAt(i));
            System.out.print(phrase.charAt(i));
            System.out.print(phrase.charAt(i));
            System.out.println();
        }

        // Inverser cet affichage ... Et plus ... Boucle imbriqué
        for (int i= phrase.length() - 1 ; i >= 0; i--)
        {
            for (int j = 0 ; j < 15; j++)
                System.out.print(phrase.charAt(i));

            System.out.println();
        }

    }
}
