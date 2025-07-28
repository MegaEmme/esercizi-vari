package org.java.esercizi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroUno = 0;
        int numeroDue = 0;

        // Validazione primo numero
        boolean isFirstInputValid = false;

        do {
            try {
                System.out.println("inserisci primo numero:");
                numeroUno = scan.nextInt();
                scan.nextLine();
                if (numeroUno >= 0) {
                    isFirstInputValid = true;
                    System.out.println("Primo numero inserito valido: " + numeroUno);
                } else {
                    System.out.println("Inserisci numeri maggiori di zero");
                }

            } catch (InputMismatchException e) {
                System.out.println("Puoi inserire solo numeri!");
                scan.nextLine();
            }
        } while (!isFirstInputValid);

        // Validazione secondo numero
        boolean isSecondInputValid = false;

        do {
            try {
                System.out.println("inserisci secondo numero:");
                numeroDue = scan.nextInt();
                scan.nextLine();
                if (numeroDue >= 0) {
                    System.out.println("Secondo numero inserito valido: " + numeroDue);
                    isSecondInputValid = true;
                } else {
                    System.out.println("Inserisci numeri maggiori di zero");
                }
            } catch (InputMismatchException e) {
                System.out.println("Puoi inserire solo numeri!");
                scan.nextLine();
            }
        } while (!isSecondInputValid);

        System.out.println(
                "\nMolto bene, input valido, procediamo adesso con la selezione dell'operazione desiderata, vuoi...\n- Addizionare  (digita '+' e INVIO)\n- Sottrarre    (digita '-' e INVIO)\n- Moltiplicare (digita '*' e INVIO)\n- Dividere     (digita '/' e INVIO)");

        String operazione;
        boolean isCorrect = false;

        do {
            operazione = scan.nextLine();
            if (operazione.equals("+")) {
                System.out.println("Addizione ( " + operazione + " )");
                isCorrect = true;
            } else if (operazione.equals("-")) {
                System.out.println("Sottrazione ( " + operazione + " )");
                isCorrect = true;
            } else if (operazione.equals("*")) {
                System.out.println("Moltiplicazione ( " + operazione + " )");
                isCorrect = true;
            } else if (operazione.equals("/")) {
                System.out.println("Divisione (" + operazione + " )");
                isCorrect = true;
            } else {
                System.out.println("Puoi inserire solo un valore tra '+' , '-' , '*' , '/' ");
            }
        } while (!isCorrect);

        double risultato = 0;
        if (operazione.equals("+")) {
            risultato = numeroUno + numeroDue;
            System.out.println("La somma tra " + numeroUno + " e " + numeroDue + " è: " + risultato);
        } else if (operazione.equals("-")) {
            risultato = numeroUno - numeroDue;
            System.out.println("La differenza tra " + numeroUno + " e " + numeroDue + " è: " + risultato);
        } else if (operazione.equals("*")) {
            risultato = numeroUno * numeroDue;
            System.out.println("La moltiplicazione tra " + numeroUno + " e " + numeroDue + " è: " + risultato);
        } else if (operazione.equals("/")) {
            if (numeroDue == 0) {
                System.out.println("Impossibile dividere per zero!");
            } else {
                risultato = (double) numeroUno / numeroDue;
                // qua devo trasformare almeno uno tra numeroUno e numeroDue in un double
                // (essendo numeroUno e numeroDue di tipo int) senno la divisione non da i
                // decimali
                System.out.println("La divisione tra " + numeroUno + " e " + numeroDue + " è: " + risultato);
            }
        }
        scan.close();
    }

}
