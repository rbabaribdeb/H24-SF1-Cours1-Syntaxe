package Revision_Intra;

public class ConversionDeType {
    public static void main(String[] args) {
        /*
        Conversions implicites sont sûres et ne nécessitent pas de syntaxe spéciale.
        Le compilateur gère cela pour vous.
        Conversions explicites nécessitent l'utilisation
        d'un opérateur de cast (par exemple, (int), (float)) et
        doivent être utilisées avec précaution pour éviter la perte de données.
        */

        int varInt = 7;
        double varDouble = 3.14;
        float varFloat = 3.14f;
        varDouble = varInt;// C Implicite
        varFloat = varInt; // C Implicite
        varDouble = varFloat; // C Implicite

        // varInt = varDouble; // Erreur Necessite un cast perte potentielle
        varInt = (int)varDouble;
        // varFloat = varDouble;// Erreur Necessite un cast perte potentielle
        varFloat = (float) varDouble;
        // varInt = varFloat;// Erreur Necessite un cast perte potentielle
        varInt = (int)varFloat;

    }
}
