package Cours11;

public class ExempleTableau1 {
    public static void main(String[] args) {

        // Sans le tableau
        int note0 = 50;
        int note1 = 60;
        int note2 = 80;
        int note3 = 100;
        int note4 = 100;

        // Avec le tableau
        int [] tabNotes = new int [5]; // crée un tableau de 5 valeurs
        tabNotes[0] = note0;
        tabNotes[1] = note1;
        tabNotes[2] = note2;
        tabNotes[3] = note3;
        tabNotes[4] = note4;
        // tabNotes[5] = 77; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        // initialiser avec des valeurs
        // int [] tabNotes = {note0, note1, note2, note3, note4};

        for (int i = 0; i < tabNotes.length; i++)
        {
            System.out.println(" tabNotes["+i+"] :" + tabNotes[i]);
        }

        // Affichage :: tabNotes = {50, 60, 80, 100, 100}.
        /*
        tabNotes = { // avant la boucle
                50, i=0
                60, i=1
                80, i=2
                100, i = 3 (tabNotes.length - 1)

                100}. // en dehors de la boucle
            */
        System.out.print("tabNotes = {");
        for (int i = 0; i < tabNotes.length-1; i++)
        {
            System.out.print(tabNotes[i] + ", ");
        }
        System.out.println(tabNotes[tabNotes.length-1] + "}");
    }

}
