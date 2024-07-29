package esercizio3;

import esercizio3.entities.Dipendente;
import esercizio3.enums.Dipartimento;

public class Esercizio3 {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("v43ex", 1.200, Dipartimento.VENDITE);
        Dipendente dipendente2 = new Dipendente("v56ex", 1.600, Dipartimento.PRODUZIONE);
        Dipendente dipendente3 = new Dipendente("v89ex", 1.800, Dipartimento.AMMINISTRAZIONE);
        Dipendente[] dipendenteArray = {dipendente1, dipendente2, dipendente3};
        print(dipendenteArray);
    }

    public static void print(Dipendente[] dipendenteArray) {
        for (Dipendente dipendente : dipendenteArray) {
            dipendente.StampaMatricola();
        }
    }
}
