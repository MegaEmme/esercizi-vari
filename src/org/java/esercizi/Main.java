package org.java.esercizi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Persona personaUno = new Persona("Michelangelo", 32);
        // Persona personaDue = new Persona("Francesco", 77);
        // System.out.println(personaUno.saluta());
        // System.out.println(personaDue.saluta());

        Prodotto ciotola = new Prodotto("Ciotola di Design", 2.99, 5);
        System.out.println(ciotola.stampaDettagli());
        Scanner scan = new Scanner(System.in);
        String scelta = null;
        boolean isCorrect = false;
        boolean isValid = false;

        do {
            System.out
                    .println("\nVuoi aggiungere/rimuovere la quantità? (digita 'Aggiungi' o 'Rimuovi' e premi INVIO)");
            scelta = scan.nextLine();
            if (scelta.equalsIgnoreCase("Aggiungi")) {
                do {
                    try {
                        System.out.println("Inserire quantità da aggiungere (solo numeri interi)");
                        int quantity = scan.nextInt();
                        scan.nextLine();
                        if (quantity > 0) {
                            ciotola.aggiungiQuantità(quantity);
                            System.out
                                    .println("Aggiunta effettuata\n- nuova quantità:\n" + ciotola.getQuantity()
                                            + " pezzi");
                            isValid = true;
                            isCorrect = true;
                        } else {
                            System.out.println("Solo numeri maggiori di zero");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Devi inserire un numero");
                        scan.nextLine();
                    }
                } while (!isValid);

            } else if (scelta.equalsIgnoreCase("Rimuovi")) {
                do {
                    try {
                        System.out.println("inserire quantità da rimuovere");
                        int quantity = scan.nextInt();
                        scan.nextLine();
                        if (quantity > 0) {
                            ciotola.rimuoviQuantità(quantity);
                            System.out.println(
                                    "Rimozione effettuata\n- nuova quantità:\n" + ciotola.getQuantity() + " pezzi");
                            isValid = true;
                            isCorrect = true;
                        } else {
                            System.out.println("Solo numeri maggiori di zero");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Devi inserire un numero");
                        scan.nextLine();
                    }
                } while (!isValid);

            } else {
                System.out.println("\nERRORE! scrivi 'aggiungi' / 'rimuovi' per procedere");
            }
        } while (!isCorrect);
        scan.close();

    }
}
