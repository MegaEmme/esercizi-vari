package org.java.array;

public class MinMax {
    // trova il massimo e il minimo
    public static void main(String[] args) {

        int[] numeri = { 5, 12, 3, 8, 20, 15, 7 };
        int max = numeri[0];
        int min = numeri[0];

        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] > max) {
                max = numeri[i];
            }

            if (numeri[i] < min) {
                min = numeri[i];
            }
        }

        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
    }

}
