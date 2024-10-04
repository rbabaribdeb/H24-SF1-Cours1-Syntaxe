package Cours8;

public class ExempleString3 {
    public static void main(String[] args) {
        // chercher dans un string avec index of
        char choixChar = 'N';
        int choixInt = 0;
        String chaine = "pPsSnNqQ0";
        int resultat = chaine.indexOf("s");
        System.out.println(" s se trouve a la position " + resultat);

        System.out.println(" Q se trouve a la position " + chaine.indexOf("Q"));
        System.out.println(" 9 se trouve a la position " + chaine.indexOf("9"));
        System.out.println(" N se trouve a la position " + chaine.indexOf('N'));
        System.out.println(" 0 se trouve a la position " + chaine.indexOf(0)); // Attention !!!
        // il faut transformer le int 0 en String
        String chaine1 = Integer.toString(0);
        System.out.println(" 0 se trouve a la position " + chaine.indexOf(chaine1)); // Attention !!!

        // ce la marche pour des mots aussi
        System.out.println("il fait bon".indexOf("bon"));


    }
}
