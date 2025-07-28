package org.java.esercizi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isInputValido = false;
        int numero = 0;

        do {
            try {
                System.out.println("Inserisci un numero intero non negativo");
                numero = scan.nextInt();
                if (numero < 0) {
                    System.out.println("Inserisci numero maggiore di zero");
                } else {
                    isInputValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Puoi inserire solo numeri");
                scan.nextLine();
                // Perche scan.nextLine()???:
                //
                // ***scan.nextInt() (e simili come nextDouble(), nextLong())***:
                // Questi metodi sono
                // progettati per leggere solo il numero. Loro leggono 123, lo convertono in un
                // int, e poi lasciano il carattere di "a capo" (\n) nel buffer di input dello
                // Scanner. Non lo "consumano".
                //
                //
                // ***scan.nextLine()***:
                // Questo metodo, invece, è progettato per leggere tutta
                // la riga di input, fino al prossimo carattere di "a capo", e poi consuma (cioè
                // rimuove) quel carattere di "a capo" dal buffer.

            }
        } while (!isInputValido);

        if (numero % 2 == 0 && isInputValido) {
            System.out.println("Il numero " + numero + " è pari");
        } else {
            System.out.println("Il numero " + numero + " è dispari");
        }

        scan.close();
    }
}
