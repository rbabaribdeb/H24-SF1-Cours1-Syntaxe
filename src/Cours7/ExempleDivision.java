package Cours7;

public class ExempleDivision {
    public static void main(String[] args) {
        //========DEBUT
        //---Données
        int montantInitial = 102;
        int diviserPar = 20;
        int resultatDeLaDivision = 0;
        int resteDelaDivision = 0;

        //---- Boucle
        resteDelaDivision = montantInitial;

        while (resteDelaDivision >= diviserPar) // 100 < 20
        {
            resteDelaDivision =resteDelaDivision - diviserPar; // 100 - 80
            resultatDeLaDivision = resultatDeLaDivision + 1;
        }

        System.out.println("resultatDeLaDivision : " + resultatDeLaDivision);
        System.out.println("resteDelaDivision : " + resteDelaDivision);


        //--------FIN
    }// fin du main
}// fin de la classe
