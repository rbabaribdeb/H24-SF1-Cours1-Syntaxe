package Cours8;

public class ExempleString4 {
    public static void main(String[] args) {
        // utilisation de substring

        String phrase = "Bon matin";
        String sub1 = phrase.substring(4);
        //String sub1 = phrase.substring(4, phrase.length()); // Équivalent
        System.out.println(sub1);

        String sub2 = phrase.substring(0, 3);
        System.out.println(sub2);

        String sub3 = sub1 + " " + sub2;
        System.out.println(sub3);




    }
}
