package Cours7;
// saisir plusieurs nombre et s'arreter quand le nombre = 0
// calculer le max
import java.util.Scanner;

public class ExempleMaxEtape4 {
    public static void main(String[] args) {
        //-------------------DEBUT
        Scanner sc = new Scanner(System.in);
        int nombre;
        int max = 0;
        do {
            System.out.print("saisir nombre : ");
            nombre = sc.nextInt();
            System.out.println("vous avec saisi : " + nombre);
            if (nombre > max)
            {
                System.out.println( nombre + " est sup a " + max);
                max = nombre;
            }else
            {
                System.out.println( nombre + " est inf a " + max);
            }

        }while (nombre != 0);
        System.out.println("Max : " + max);

        //------------------- FIN
    }
}

/*
saisir nombre : 5
vous avec saisi : 5
5 est sup a 0
saisir nombre : 6
vous avec saisi : 6
6 est sup a 5
saisir nombre : 12
vous avec saisi : 12
12 est sup a 6
saisir nombre : 0
vous avec saisi : 0
0 est inf a 12
Max : 12
 */