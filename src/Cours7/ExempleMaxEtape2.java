package Cours7;
// saisir plusieurs nombre
import java.util.Scanner;
public class ExempleMaxEtape2 {
    public static void main(String[] args) {
        //-------------------DEBUT
        Scanner sc = new Scanner(System.in);
        int nombre;
        do {
            System.out.print("saisir nombre : ");
            nombre = sc.nextInt();
            System.out.println("vous avec saisi : " + nombre);

        }while (true);


        //------------------- FIN
    }
}
