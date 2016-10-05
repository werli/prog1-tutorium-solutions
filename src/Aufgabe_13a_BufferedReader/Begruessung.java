package Aufgabe_13a_BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Begrüßung: Schreibe ein Programm, welches einen String input von der Konsole einliest und dann “Hallo <input>” ausgibt.
 * Bei einem Fehler (Exception) soll eine sinnvolle Fehlermeldung ausgegeben werden.
 * Hinweis: Verwende einen {@link BufferedReader} und einen {@link InputStreamReader}.
 * Füge dazu oben im Programm
 * <p>
 * <blockquote><pre>
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * </pre></blockquote>
 * <p>
 * hinzu.
 * <p>
 *
 * @author Phil Werli
 */
public class Begruessung {

    public static void main(String[] args) throws IOException {

        /*
        Initialisierung des "reader", mit dem ihr Konsoleneingaben einlesen könnt.
        Der InputStreamReader dekodiert die Bytes, die ihr in der Konsole eingebt, in Characters.
        Der BufferedReader bietet einen Buffer, der es ermöglicht, den input effizienter einzulesen.
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        /*
        Lesevorgang und Speichern der Eingabe im String input. Der Lesevorgang könnte eine IOException zur
        Folge haben, nachdem diese aber hier zu vernachlässichen ist kann man sie im Methodenkopf werfen (throw)
        */
        String input = reader.readLine();
        System.out.println("Hallo " + input);

    }
}


