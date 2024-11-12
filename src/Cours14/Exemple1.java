package Cours14;

public class Exemple1 {
    public static void main(String[] args) {
        // Ecrire une méthode qui recupere un srting et retourne un tableau de char
        char [] tabChar= decoupeString("Bonjour");
        // Ecrire une methode qui calcule le nombre d evoyelle dans un tableau de char
        System.out.println("nombre de voyelles : " + nbrVoyelleDansChar(tabChar));
        // methode qui inverse un string
        System.out.println(inverserString("ChaineAInverser..."));
    }

    public static String inverserString(String chaine)
    {
        String inverseChaine = "";
        for (int i = chaine.length() - 1 ; i >= 0 ; i--)
        {
            inverseChaine = inverseChaine + chaine.charAt(i);
        }
        return inverseChaine;
    }
    public static int nbrVoyelleDansChar(char[] tabChar)
    {
        String voyelles = "aouiyeAOUIYE";
        int compteurVoyelles = 0;
        for (int i = 0; i < tabChar.length; i++)
        {
            if ( voyelles.indexOf(tabChar[i]) != -1) // tabChar[i] == 'a' || tabChar[i] == 'o'...
            {
                compteurVoyelles++;
            }

        }
        return compteurVoyelles;
    }
    public static char[] decoupeString(String chaine)
    {
        char[] chaineChar = new char[chaine.length()];
        for (int i = 0; i < chaine.length(); i++) {
            chaineChar[i] = chaine.charAt(i);
        }
        return chaineChar;
    }




}
