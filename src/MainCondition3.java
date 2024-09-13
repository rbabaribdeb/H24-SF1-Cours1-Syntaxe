/*
Afficher à quelle catégorie (enfant/adolescent/adulte)
de personnes appartient un individu en fonctionde son âge.
L’âge est saisi au clavier.
Décrire les étapes de votre algorithme creately.com
 */
public class MainCondition3 {
    public static void main(String[] args) {
    //DEBUT
    int age = -3; // Code avec erreur

    //-------------------------------
    if (age < 0 || age > 120)
    {
        System.out.println("Age non valide");
    }  else
    {
        if (age < 12)
        {
            System.out.println("Bonjour Enfant");
        }
        else if (age < 18)
        {
            System.out.println("Bonjour Ado");
        }
        else
        {
            System.out.println("Bonjour adulte");
        }
    }

//FIN
    }

}
