package Cours7;
// saisir plusieurs nombre et s'arreter quand le nombre = 0
// calculer le max
import java.util.Scanner;

public class ExempleMaxEtape5 {
    public static void main(String[] args) {
        //-------------------DEBUT
        Scanner sc = new Scanner(System.in);
        int nombre;
        int max = 0;
        int position = 0 ;
        int positionMax =0;
        do {
            System.out.print("saisir nombre : ");
            nombre = sc.nextInt();
            System.out.println("vous avec saisi : " + nombre);
            position = position +1;
            if (nombre > max)
            {
                System.out.println( nombre + " est sup a " + max);
                max = nombre;
                positionMax = position;
            }else
            {
                System.out.println( nombre + " est inf a " + max);
            }
        }while (nombre != 0);
        System.out.println("Max : " + max);
        System.out.println("PositionMax : " + positionMax);
        //------------------- FIN
    }
}

/*
saisir nombre : 6
vous avec saisi : 6
6 est sup a 0
saisir nombre : 123
vous avec saisi : 123
123 est sup a 6
saisir nombre : 5
vous avec saisi : 5
5 est inf a 123
saisir nombre : 6
vous avec saisi : 6
6 est inf a 123
saisir nombre : 6
vous avec saisi : 6
6 est inf a 123
saisir nombre : 0
vous avec saisi : 0
0 est inf a 123
Max : 123
PositionMax : 2
 */