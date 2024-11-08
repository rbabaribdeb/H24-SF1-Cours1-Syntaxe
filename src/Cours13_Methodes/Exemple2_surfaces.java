package Cours13_Methodes;

public class Exemple2_surfaces {
    public static void main(String[] args) {

        double rayon1=1, rayon2=2,rayon3=3,rayon4=4,rayon5=5;
        double circonference;
        double surface;
        //-------------
        circonference=2*rayon1*3.14 ;
        surface= rayon1*rayon1*3.14 ;
        System.out.println("La circonference pour R= "+rayon1+" est: "+ circonference) ;
        System.out.println("La surface pour R= "+surface) ;
        //---------------
        AfficherMenu();
        calculerSurface(rayon1);
        calculerSurface(rayon2);
        calculerSurface(rayon3);
        calculerSurface(rayon4);
        calculerSurface(rayon5);

        //-------------
        circonference=2*rayon2*3.14 ;
        surface= rayon2*rayon2*3.14 ;
        System.out.println("La circonference pour R= "+rayon2+" est: "+ circonference) ;
        System.out.println("La surface pour R= "+surface) ;
        //----------------
        circonference=2*rayon3*3.14 ;
        surface= rayon3*rayon3*3.14 ;
        System.out.println("La circonference pour R= "+rayon3+" est: "+ circonference) ;
        System.out.println("La surface pour R= "+surface) ;
        //-----------------
        circonference=2*rayon4*3.14 ;
        surface= rayon4*rayon4*3.14 ;
        System.out.println("La circonference pour R= "+rayon4+" est: "+ circonference) ;
        System.out.println("La surface pour R= "+surface) ;
        circonference=2*rayon5*3.14 ;
        surface= rayon5*rayon5*3.14 ;
        System.out.println("La circonference pour R= "+rayon5+" est: "+ circonference) ;
        System.out.println("La surface pour R= "+surface) ;


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
