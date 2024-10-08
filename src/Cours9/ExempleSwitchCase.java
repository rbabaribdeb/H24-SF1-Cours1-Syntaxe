package Cours9;

import java.util.Scanner;

public class ExempleSwitchCase {
    public static void main(String[] args) {
        // - - - - - Début
        Scanner sc = new Scanner(System.in);
        boolean doitRepeter = true;
        boolean estUnJourDeSemaine = false;
        boolean estUnJourDeFinDeSemaine = false;

        do {

        System.out.println("veillez saisir un chiffre entre 1 et 7");
       // int chiffre = sc.nextInt();
        char choix = sc.nextLine().charAt(0);
        switch(choix)
        {
            case 'a':
            case 'A':
            case '1': System.out.println("Lundi");
                estUnJourDeSemaine = true;
            break;

            case '2', 'b','B': System.out.println("Mardi");break;

            case '3': System.out.println("Merecredi");
                estUnJourDeSemaine = true;
                break;
                // !!!!!!!!!!!!!!!! FAUT METTRE LE BREAK
            case '4': System.out.println("Jeudi");
                estUnJourDeSemaine = true;
                break;// ATTENTION !!!!!!!!!!!!!!!! FAUT METTRE LE BREAK
            case '5': System.out.println("Vendredi");
                estUnJourDeSemaine = true;
                break;// !!!!!!!!!!!!!!!! FAUT METTRE LE BREAK
            case '6': System.out.println("Samedi");
                estUnJourDeFinDeSemaine = true;
                break;// !!!!!!!!!!!!!!!! FAUT METTRE LE BREAK
            case '7': System.out.println("Dimanche");
                estUnJourDeFinDeSemaine = true;
                break;
            case 'q','Q' : doitRepeter = false;
                            System.out.println("Vous avez quitter");
                            break;
            default:
                System.out.println("Choix erroné");
                System.out.println("default : valeur non comprise entre 1 et 7, a et g");
                doitRepeter = true;
                break; // Facultatif
        }
        }while (doitRepeter);


        // - - - - - Fin
    }
}
