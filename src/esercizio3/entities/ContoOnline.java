package esercizio3.entities;

import esercizio3.exceptions.BancaException;

public class ContoOnline extends ContoCorrente {
    private final double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + getTitolare() + " - Saldo: " + getSaldo() + " - Num movimenti: " + getnMovimenti() + " - Massimo movimenti: " + getMaxMovimenti() + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {

        if (x <= maxPrelievo) {
            super.preleva(x);
        }
        if (x > maxPrelievo) throw new BancaException("Il prelievo non è disponibile");

    }

    public double getMaxPrelievo() {
        return maxPrelievo;
    }

}
