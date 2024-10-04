package Cours8;

public class ExempleString1 {
    public static void main(String[] args) {
        //Créer un string concatener comparer
        String chaine1 = "Une premiere phrase";
        String chaine2 = new String("Une deuxieme phrase");

        //Concatener des chaines
        String chaine3 = chaine1 + chaine2; // concatener
        String chaine4 = chaine1.concat(chaine2); // concatener

        System.out.println("chaine3 : " + chaine3);
        System.out.println("chaine4 : " + chaine4);

        // Comparer des chaines
        boolean compare = chaine1.equals(chaine2);
        System.out.println("compare : " + compare);

        boolean compare2 = "allo" == "ALLO";
        System.out.println("compare2 : " + compare2);

        boolean compare3 = "allo" == "ALLO".toLowerCase(); // ATTENTION
        System.out.println("compare3 : " + compare3);

        boolean compare4 = "allo".equals("ALLO".toLowerCase());
        System.out.println("compare4 : " + compare4);

        boolean compare5 = "allo".equalsIgnoreCase("ALLO");
        System.out.println("compare5 : " + compare5);
    }

}
