package Revision_Intra;

public class DivisionEntiere {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int resultat = a / b; // resultat vaudra 2 (partie décimale ignorée)
        System.out.println(resultat); // Affiche 2

        double da = 7;
        double db = 3;
        double dresultat = a / b; // resultat vaudra environ 2.3333
        System.out.println(dresultat); // Affiche 2.3333333333333335

        /*
        Lorsque vous mélangez des types
        (par exemple, un int et un double),
        Java promeut automatiquement l'entier
        au type flottant pour effectuer la division
        à virgule flottante.
        */
        int ca = 7;
        double cb = 3;
        double cresultat = a / b; // a est promu à double
        System.out.println(cresultat); // Affiche 2.3333333333333335

        // Warning : 'a / b': integer division in floating-point context

        // Division entière
        int divisionEntiere = a / b; // Résultat : 2
        System.out.println("Division entière : " + divisionEntiere);

        // Division flottante
        double divisionFlottante = (double) a / b; // Résultat : 2.3333
        double divisionNonFlottante = (double) (a / b); // Résultat : 2.0
        System.out.println("Division flottante : " + divisionFlottante);
        System.out.println("Division non Flottante : " + divisionNonFlottante);

        /*
        Division entière : 2
        Division flottante : 2.3333333333333335
        Division non Flottante : 2.0
         */
    }
}
