package org.java.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int[] temperatureSettimanali = new int[7];
        String[] nomiGiorni = { "Lunedi", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica" };
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < temperatureSettimanali.length; i++) {
            boolean isInputValid = false;
            do {
                try {
                    System.out.println("Inserisci temperatura per:" + nomiGiorni[i]);
                    temperatureSettimanali[i] = scan.nextInt();
                    scan.nextLine();
                    isInputValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Inserisci un numero intero!");
                }
            } while (!isInputValid);
        }

        scan.close();

        int temperaturaSomma = 0;
        int temperaturaMax = temperatureSettimanali[0];
        int temperaturaMin = temperatureSettimanali[0];

        for (int i = 0; i < temperatureSettimanali.length; i++) {

            System.out.println(nomiGiorni[i] + ": " + temperatureSettimanali[i] + " gradi");

            temperaturaSomma += (temperatureSettimanali[i]);

            if (temperatureSettimanali[i] > temperaturaMax) {
                temperaturaMax = temperatureSettimanali[i];
            }
            if (temperatureSettimanali[i] < temperaturaMin) {
                temperaturaMin = temperatureSettimanali[i];
            }
        }

        double temperaturaMedia = (double) temperaturaSomma / temperatureSettimanali.length;
        System.out.println("Temperatura media per la settimana: " + String.format("%.2f", temperaturaMedia) + " gradi");
        System.out.println("Temperatura massima: " + temperaturaMax + " gradi");
        System.out.println("Temperatura minima: " + temperaturaMin + " gradi");
    }
}
