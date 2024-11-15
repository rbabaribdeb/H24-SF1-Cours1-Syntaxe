package Cours14;

public class Exemple2 {
    public static void main(String[] args) {

        int[] tab1 = {0,2,5,55,26,2,57,4,1,5,5,4,6,64,0,0,0,0,0,1,2,2};
        //Affichage avant
        afficheTab(tab1);
        System.out.println(returnAfficheTab(tab1));

    }
    public static String returnAfficheTab(int[] tab)
    {
        String chaine = "tab = {";
       // System.out.print("tab = {");

        for (int i = 0; i < tab.length-1; i++)
        {
           // System.out.print(tab[i] + ", ");
            chaine = chaine + tab[i] + ",";
        }
        chaine = chaine + tab[tab.length-1] + "}";
        return chaine;

    }
    public static void afficheTab(int[] tab)
    {
        System.out.print("tab = {");
        for (int i = 0; i < tab.length-1; i++)
        {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1] + "}");

    }


}
