public class MainExempleMath {
    public static void main(String[] args) {

        System.out.println("hello world");

        double val1 = Math.PI * 2;
        System.out.println("val1 = " + val1);
        double val2 = Math.sqrt(2.5);
        System.out.println("val2 = " + val2);
        double val3 = Math.pow(2,32);
        System.out.println("val3 = " + val3);
        // nombre aleatoire
        double val4 = Math.ceil(Math.random() * 6);
        System.out.println("val4 = " + val4);
        // cast
        double val5 = (int)(Math.random() * 6);
        System.out.println("val5 = " + val5);

        // racine de x3 + 1 pour x = 5
        double x= 5;
        double xPuissance3 = Math.pow(x,3);
        double resultat = Math.sqrt(xPuissance3 + 1 );
        System.out.println("resultat = " + resultat);

        //manière plus courte
        System.out.println("resultat2 = " + Math.sqrt(Math.pow(x,3) + 1 ));





    }


}
