package org.java.array;

public class ArrayDiOggetti {
    public static void main(String[] args) {
        Persona[] gruppoDiAmici = new Persona[3];

        gruppoDiAmici[0] = new Persona("Mike", 32);
        gruppoDiAmici[1] = new Persona("Francesco", 77);
        gruppoDiAmici[2] = new Persona("Olimpia", 69);

        System.out.println("Salutiamo il gruppo di amici");
        for (Persona persona : gruppoDiAmici) {
            persona.saluta();
        }

        System.out.println("Troviamo il più giovane e il più anziano");
        Persona giovane = gruppoDiAmici[0];
        Persona anziano = gruppoDiAmici[0];

        for (int i = 1; i < gruppoDiAmici.length; i++) {

            if (gruppoDiAmici[i].getEta() < giovane.getEta()) {
                giovane = gruppoDiAmici[i];
            }

            if (gruppoDiAmici[i].getEta() > anziano.getEta()) {
                anziano = gruppoDiAmici[i];
            }
        }

        System.out.println("Piu giovane: " + giovane.getNome() + ", " + giovane.getEta() + " anni;\nPiù anziano: "
                + anziano.getNome() + ", " + anziano.getEta() + " anni;");
    }
}
