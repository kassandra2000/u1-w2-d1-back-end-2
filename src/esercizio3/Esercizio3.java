package esercizio3;


import esercizio3.entities.ContoCorrente;
import esercizio3.entities.ContoOnline;
import esercizio3.exceptions.BancaException;

public class Esercizio3 {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("sandro", 20);
        ContoOnline contoOnline = new ContoOnline("giovanni", 200, 100);
        try {
            conto.preleva(30.00);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }
        try {
            contoOnline.preleva(150);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }

    }
}
