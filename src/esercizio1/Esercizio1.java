package esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1, 11);
        }
        System.out.println(Arrays.toString(arr));


        while (true) {
            try {

                System.out.println("inserisci un nuovo numero, oppure  premi 0 per uscire");
                int num = Integer.parseInt(sc.nextLine());
                if (num == 0) {
                    break;
                }
                System.out.println("scegli una posizione tra 1 e 5 , premi 0 per uscire ");
                int index = Integer.parseInt(sc.nextLine());
                if (index == 0) {
                    break;
                } else {
                    arr[index - 1] = num;
                }
                System.out.println(Arrays.toString(arr));

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Devi inserire un numero tra 1 e 5");
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero ");
            } catch (Exception e) {
                System.out.println("Errore nell'inserimento");
            }
        }
        sc.close();
    }


}