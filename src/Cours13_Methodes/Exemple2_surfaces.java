package Cours13_Methodes;

public class Exemple2_surfaces {
    public static void main(String[] args) {

        double rayon1=1, rayon2=2,rayon3=3,rayon4=4,rayon5=5;
        double circonference;
        double surface;
        //-------------
        AfficherMenu();
        calculerSurface(rayon1);
        calculerCirconference(rayon1);
        calculerSurface(rayon2);
        calculerCirconference(rayon2);
        calculerSurface(rayon3);
        calculerCirconference(rayon3);
        calculerSurface(rayon4);
        calculerCirconference(rayon4);
        calculerSurface(rayon5);
        calculerCirconference(rayon5);
    }

    /**
     * Méthode calculerSurface avec parametre rayon et ne retourne rien (void)
     * calculerSurface(rayon1); // de cette maniere on appelle la méthode depuis le main ...
     * @param rayon
     */
    public static void calculerSurface(double rayon)
    {
        double surface= rayon*rayon*3.14 ;
        System.out.println("La surface pour R= "+surface) ;
    }

    /**
     * Méthode calculerCirconference avec parametre rayon et ne retourne rien (void)
     * @param rayon
     */
    public static void calculerCirconference(double rayon)
    {
        double circonference=2*rayon*3.14 ;
        System.out.println("La circonference pour R= "+rayon+" est: "+ circonference) ;
    }

    /**
     * Methode Sans parametre sans retour
     */
    public static void AfficherMenu()
    {
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("--------       CALCUL     ------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

    }



}
