package org.java.esercizi;

public class Persona {
    // ATTRIBUTI
    private String name;
    private int eta;

    // COSTRUTTORI
    public Persona(String name, int eta) {
        this.name = name;
        this.eta = eta;
    }

    // GETTER E SETTER
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    // METODI AGGIUNTIVI

    public String saluta() {
        return "Ciao, mi chiamo " + this.name + " e ho " + this.eta + " anni";
    }

}
