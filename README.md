# Esercizio 1

Scrivi un programma che chieda all'utente di inserire un numero intero. Il programma deve poi verificare se il numero inserito è pari o dispari e stampare un messaggio appropriato (es. "Il numero [X] è pari." oppure "Il numero [Y] è dispari.").

Suggerimenti per la logica:

Come puoi determinare se un numero è pari o dispari usando le operazioni matematiche che conosci? Pensa all'operatore modulo (%).

Come puoi "chiedere" un input all'utente nel linguaggio di programmazione che stai usando?

Come puoi "stampare" un output?

Quale costrutto condizionale useresti per fare la verifica (pari/dispari)?

Implementare controlli e gestione errori

# Esercizio 2

Obiettivo: Scrivere un programma che funzioni come una calcolatrice molto semplice. L'utente dovrà:

Inserire il primo numero (gestendo input non validi o negativi).

Inserire il secondo numero (gestendo input non validi o negativi).

Scegliere un'operazione tra + (somma), - (sottrazione), * (moltiplicazione), / (divisione). Dovrai assicurarti che l'operazione sia valida.

Eseguire l'operazione scelta e stampare il risultato.

Gestire la divisione per zero: Se l'utente tenta di dividere per zero, il programma deve stampare un messaggio di errore appropriato e non deve andare in crash.

Suggerimenti per la Logica e l'Implementazione:
Input Numerici: Per i due numeri, riutilizza la logica del do-while e del try-catch che hai appena perfezionato. Dovrai applicarla due volte!

Input Operazione:

Potresti leggere l'operazione come una Stringa (es. String operazione = scan.nextLine();).

Poi userai degli if-else if-else per controllare quale operazione è stata inserita (es. if (operazione.equals("+"))).

Se l'operazione non è una delle quattro previste, stampa un messaggio di errore e ri-chiedi l'input (qui ti servirà un altro ciclo do-while per validare l'operazione, magari usando una variabile boolean come isOperazioneValida).

Divisione per Zero:

Quando l'utente sceglie la divisione (/), prima di eseguire l'operazione, controlla se il secondo numero è 0.

Se lo è, stampa un messaggio come "Errore: Non è possibile dividere per zero." e non eseguire la divisione.

Tipo di Variabili: Pensa se ti servono int o double per i numeri e il risultato, soprattutto considerando la divisione.

# Esercizi 3/4 

Creazione classi con attributi, costruttori e metodi 

# Esercizi 5/6 

Array

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
