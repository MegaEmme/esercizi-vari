package org.java.esercizi;

public class Prodotto {
    private String name;
    private double price;
    private int quantity;

    public Prodotto(String name, double price, int quantity) {
        this.name = name;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Il prezzo non può essere negativo, impostato a : 0.0 € per il prodotto: " + name);
            this.price = 0.0;
        }
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("La quantità non può essere negativa, impostato a : 0 pezzi per il prodotto: " + name);
            this.quantity = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void aggiungiQuantità(int aggiunta) {

        if (aggiunta > 0) {
            this.quantity += aggiunta;
        } else {
            System.out.println("Non puoi aggiungere quantità negative");
        }

    }

    public void rimuoviQuantità(int rimozione) {
        if (rimozione > this.quantity) {
            System.out.println("Non puoi rimuovere il prodotto: \"" + name
                    + "\" in quantità maggiore rispetto alla sua disponbilità! ( totale pezzi: " + quantity + " )");
        } else if (rimozione <= 0) {
            System.out.println("non puoi rimuovere quantità negative");
        } else {
            this.quantity -= rimozione;
        }
    }

    public String stampaDettagli() {
        return "Nome prodotto: \n- " + name + "\nAl prezzo di: \n- " + price + " Euro\nDisponbiltà:\n- " + quantity
                + " pezzi";
    }
}
