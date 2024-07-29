package esercizio3.entities;

import esercizio3.enums.Dipartimento;

public class Dipendente {
    private final String matricola;
    private final double stipendio;
    private Dipartimento dipartimento;

    // costruttore

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //metodi
    public void StampaMatricola() {

        System.out.println(this.matricola);
    }

//    getter e setter

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public double getStipendio() {
        return stipendio;
    }


    public String getMatricola() {
        return matricola;
    }
}
