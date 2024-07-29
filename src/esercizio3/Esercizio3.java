package esercizio3;


import esercizio3.entities.ContoCorrente;
import esercizio3.entities.ContoOnline;
import esercizio3.exceptions.BancaException;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        //Conto Corrente
        ContoCorrente conto = new ContoCorrente("sandro", 20);
        System.out.println("quanto vuoi prelevare? ");
        Scanner sc = new Scanner(System.in);
        try {
            double num = Double.parseDouble(sc.nextLine());
            conto.preleva(num);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("devi inserire un numero");
        } catch (Exception e) {
            System.out.println("Errore nel prelievo");
        }

        //conto Online
        ContoOnline contoOnline = new ContoOnline("giovanni", 200, 100);
        System.out.println("quanto vuoi prelevare? ");
        try {
            double num = Double.parseDouble(sc.nextLine());
            contoOnline.preleva(num);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("devi inserire un numero");
        } catch (Exception e) {
            System.out.println("Errore nel prelievo");
        }

    }
}
