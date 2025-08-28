package org.java.errori;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        // checked exception
        // !) Metodo try-catch-finally
        try {
            FileReader reader = new FileReader("path/inesistente.txt");
            reader.close();
        } catch (FileNotFoundException exc) {
            // eccezione corretta che manda questo messaggio (deve stare in cima sennò viene
            // mangiata da quella piu generica)
            System.out.println("File non trovato, controlla indirizzo inserito ");
        } catch (Exception e) {
            // eccezione più generica, in cui si entra se la prima va a buon fine (e gli
            // diciamo di recuperare il messaggio da e.getMessage())
            System.out.println("C'è stata un'eccezione del tipo " + e.getMessage());
        } finally {
            // messaggio che viene visualizzato a prescindere
            System.out.println("Esecuzione programma terminata");
        }

        // 2) Metodo col throw new
        // throw new IllegalArgumentException("Argomento non piaciuto");
        throw new FileNotFoundException("Argomento non Piaciuto");
    }
}
