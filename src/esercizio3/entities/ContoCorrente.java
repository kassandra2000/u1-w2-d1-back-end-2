package esercizio3.entities;

import esercizio3.exceptions.BancaException;

public class ContoCorrente {
    final private int maxMovimenti = 50;
    private final String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti)
            saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;

        if (saldo < 0)
            throw new BancaException("il conto è in rosso");
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public String getTitolare() {
        return titolare;
    }


    public int getnMovimenti() {
        return nMovimenti;
    }


    public double getSaldo() {
        return saldo;
    }


}
