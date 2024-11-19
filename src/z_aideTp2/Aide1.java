package z_aideTp2;

public class Aide1 {
    public static void main(String[] args) {

        // declarer un tableau
        int [] tab = {1,2,3,4,54,56,87};
        double moyenne = calculMoyenne(tab);
        System.out.println("Moyenne: " + moyenne);

    }

    public static double calculMoyenne(int[] tab)
    {
        double moyenne = 0;
        double sum = 0;
        for (int i = 0; i < tab.length; i++)
        {
            sum = sum + tab[i];
        }
        moyenne = (double)sum / tab.length;
        return moyenne;
    }

}
