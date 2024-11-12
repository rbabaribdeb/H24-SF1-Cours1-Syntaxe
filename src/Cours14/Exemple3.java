package Cours14;

import static Cours14.Exemple2.*;

public class Exemple3 {
    public static void main(String[] args) {

        int[] tab1 = {0,2,5,55,26,2,57,4,1,5,5,4,6,64,0,-2000,0,0,0,1,2,2};
        //Affichage avant
        afficheTab(tab1);
        System.out.println("somme = " + calculSomme(tab1));
        System.out.println("moyenne = " + calculMoyenne(tab1));
        System.out.println("Le max = " + calculMax(tab1));
        System.out.println("Le min = " + calculMin(tab1));
        afficheTab(trier(tab1)); // LE tableau tab1 est modifé ATTENTION (PASSAGE PAR REFERENCE ET NON COPIE)
        afficheTab(tab1);
        afficheTab(genereTabAleatoire(8));
    }
    public static double calculSomme(int [] tab)
    {
        int somme = 0;
        for (int i = 0; i < tab.length; i++)
        {
            somme += tab[i];
        }
        return somme;
    }

    public static double calculMoyenne(int [] tab)
    {
        return calculSomme(tab) / tab.length;
    }

    public static int calculMax(int [] tab)
    {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] > max)
            {
                max = tab[i];
            }
        }
        return max;
    }
    public static int calculMin(int [] tab)
    {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] < min)
            {
                min = tab[i];
            }
        }
        return min;
    }

    /**
     *
     * @param tab ATTENTION le tab est modifé (passage par référence ... )
     * @return
     */
    public static int[] trier(int [] tab)
    {
      int temporire =0;
        for (int j = 0; j < tab.length-1; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] >= tab[i + 1]) {
                    //Echanger
                    temporire = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temporire;
                }
            }
        }
        return tab;
    }



    public static int[] genereTabAleatoire(int tailleTab)
    {
        int[] tab = new int[tailleTab];
        for (int i = 0; i < tailleTab; i++)
        {
            tab[i] = (int)(100 * Math.random());
        }

        return tab;


    }



}
