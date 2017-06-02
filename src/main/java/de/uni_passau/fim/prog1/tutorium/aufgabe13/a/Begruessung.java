package de.uni_passau.fim.prog1.tutorium.aufgabe13.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Begrüßung: Schreibe ein Programm, welches einen String input von der Konsole einliest und dann “Hallo <input>” ausgibt.
 * Bei einem Fehler (Exception) soll eine sinnvolle Fehlermeldung ausgegeben werden.
 * Hinweis: Verwende jeweils einen {@link BufferedReader} und einen {@link Scanner}.
 * <p>
 * Dazu müssen folgende Pakete importiert werden:
 * <p>
 * <blockquote><pre>
 * import java.io.InputStreamReader;
 * import java.util.Scanner;
 * import java.io.BufferedReader;
 * </pre></blockquote>
 * <p>
 * hinzu.
 * <p>
 *
 * @author <a href="http://github.com/werli">Phil Werli</a>
 */
public class Begruessung {

    /**
     * Dieses Programm liest von der Konsole mit dem {@link BufferedReader} und dem {@link Scanner} jeweils eine Zeile
     * eine und gibt diese wieder mit einem Präfix auf der Konsole aus.
     *
     * @param args Konsolenargumente, die in diesem Programm nicht verwendet werden.
     */
    public static void main(String[] args) {
        /*
         * Initialisierung des BufferedReader. Dem BufferedReader muss als Parameter als Eingabequelle
         * ein InputStreamReader über den Konstruktur mitgegeben werden.
         * Der InputStreamReader dekodiert die Bytes, die ihr in der Konsole eingebt, in Characters.
         * Der BufferedReader bietet einen Buffer, der es ermöglicht, den Input effizienter einzulesen.
         */
        final InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);


        /*
         * Initialisierung des Scanners. Dem Scanner muss als Parameter eine Eingabequelle über den Konstruktur
         * mitgegeben werden. Nachdem die Eingaben der Konsole eingelesen werden sollen, wird, wie oben, der
         * InputStreamReader verwendet.
         */
        Scanner scanner = new Scanner(new InputStreamReader(System.in));


        // BufferedReader
        System.out.println("Eingabe durch BufferedReader: ");

        /*
         * Lesevorgang durch den BufferedReader und Speicherung der Eingabe im String `input1`.
         * Der Lesevorgang könnte eine IOException zur Folge haben, nachdem diese aber hier zu
         * vernachlässichen ist, kann man sie im Methodenkopf durch `throws` werfen.
         */
        try {
            String input1 = bufferedReader.readLine();
            System.out.println("Hallo " + input1);
        } catch (IOException e) {
            System.err.println("Fehler bei der Eingabe mit dem BufferedReader!");
        }


        // Scanner
        System.out.println("Eingabe durch Scanner: ");

        /*
        * Lesevorgang durch den Scanner und Speicherung der Eingabe im String `input2`.
        * Ähnlich wie beim BufferedReader kann eine IOException (oder Subklassen von IOException)
        * auftreten. Diese wird wie oben auch im Methodenkopf durch `throws` geworfen.
        */
        try {
            String input2 = scanner.nextLine();
            System.out.println("Hallo " + input2);
        } catch (NoSuchElementException e) {
            System.err.println("Fehler bei der Eingabe mit dem Scanner!");
        }
    }
}


