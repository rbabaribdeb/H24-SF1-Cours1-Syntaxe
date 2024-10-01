package Cours7;

// saisir un nombre

import java.util.Scanner;


public class ExempleMaxEtape1 {
    public static void main(String[] args) {
        //-------------------DEBUT
        Scanner sc = new Scanner(System.in);

        System.out.print("saisir nombre : ");
        int nombre = sc.nextInt();

        System.out.println("vous avec saisi : " + nombre);

        //------------------- FIN
    }
}
