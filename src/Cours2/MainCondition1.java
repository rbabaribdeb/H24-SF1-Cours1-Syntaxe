package Cours2;

/*
Afficher à quelle catégorie (enfant/adolescent/adulte)
de personnes appartient un individu en fonctionde son âge.
L’âge est saisi au clavier.
Décrire les étapes de votre algorithme creately.com
 */
public class MainCondition1 {
    public static void main(String[] args) {
    //DEBUT
    int age = -3;
    boolean estEnfant = age < 12 && age > 0;
    boolean estAdo = age >= 12 && age <= 18;
    boolean estAdulte = age >= 18 && age <= 125; // ***
    //-------------------------------
        if (estEnfant)
        {
            System.out.println("Bonjour Enfant");
        }
        if (estAdo)
        {
            System.out.println("Bonjour Ado");
        }
        if (estAdulte)
        {
            System.out.println("Bonjour adulte");
        }


//FIN
    }

}
