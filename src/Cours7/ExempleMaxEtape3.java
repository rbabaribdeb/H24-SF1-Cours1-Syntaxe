package Cours7;
// saisir plusieurs nombre et s'arreter quand le nombre = 0
import java.util.Scanner;

public class ExempleMaxEtape3 {
    public static void main(String[] args) {
        //-------------------DEBUT
        Scanner sc = new Scanner(System.in);
        int nombre;
        do {
            System.out.print("saisir nombre : ");
            nombre = sc.nextInt();
            System.out.println("vous avec saisi : " + nombre);

        }while (nombre != 0);


        //------------------- FIN
    }
}
