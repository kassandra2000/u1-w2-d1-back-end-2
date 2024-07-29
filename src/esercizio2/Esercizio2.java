package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intero
        try {
            System.out.println("inserisci il numero di  km  che hai percorso");
            int km = Integer.parseInt(sc.nextLine());
            System.out.println("inserisci i litri di carburante che hai consumato");
            int litri = Integer.parseInt(sc.nextLine());
            System.out.println("hai consumato " + km / litri + " l/km");
        } catch (ArithmeticException e) {
            System.out.println("non puoi inserire 0");
        } catch (NumberFormatException e) {
            System.out.println("devi inserire un numero");
        } catch (Exception e) {
            System.out.println("errore: " + e.getMessage());
        }
        //double
        try {
            System.out.println("inserisci il numero di  km  che hai percorso");
            double km = Double.parseDouble((sc.nextLine()));
            System.out.println("inserisci i litri di carburante che hai consumato");
            double litri = Double.parseDouble((sc.nextLine()));
            if (litri == 0) System.out.println("Errore: i litri di carburante consumato non possono essere zero.");
            else System.out.println("hai consumato " + km / litri + " l/km");
        } catch (NumberFormatException e) {
            System.out.println("devi inserire un numero");
        } finally {
            sc.close();
        }


    }

}