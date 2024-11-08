package Cours13_Methodes;

public class Exemple4_surfaces {
    public static void main(String[] args) {
        double [] rayons = {1,2,3,4,5};
        AfficherMenu();
        for(int i=0; i<rayons.length; i++)
        {calculerSurfaceEtCirconference(rayons[i]);}
    }

    /**
     * Méthode calculerSurfaceEtCirconference avec parametre rayon et ne retourne rien (void)
     * calculerSurfaceEtCirconference(rayon1); // de cette maniere on appelle la méthode depuis le main ...
     * @param rayon
     */
    public static void calculerSurfaceEtCirconference(double rayon)
    {
        calculerSurface(rayon);
        calculerCirconference(rayon);
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
