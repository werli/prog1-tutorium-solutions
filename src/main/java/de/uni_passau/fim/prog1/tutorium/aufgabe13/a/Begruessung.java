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
         * Initialisierung des BufferedReader. Dem BufferedReader kann als Parameter eine Eingabequelle
         * über den Konstruktur mitgegeben werden. Es muss eine Instanz der Klasse 'Reader' sein.
         * Das könnte beispielsweise ein FileReader, ein StringReader oder ein InputStreamReader sein.
         * System.out ist schon bekannt und ein OutputStream. Das Gegenstück dazu ist System.in, ein InputStream
         * der Daten von der Konsole einlesen kann.
         *
         * Der InputStreamReader dekodiert die Bytes, die ihr in der Konsole eingebt, in Characters.
         * Der BufferedReader bietet einen Buffer, der es ermöglicht, den Input effizienter einzulesen.
         */
        final InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);


        /*
         * Initialisierung des Scanners. Dem Scanner muss als Parameter eine Eingabequelle über den Konstruktur
         * mitgegeben werden. Nachdem die Eingaben der Konsole eingelesen werden sollen, kann man direkt
         * einen InputStream angeben. Wie oben wird wieder System.in gewäht.
         */
        Scanner scanner = new Scanner(new InputStreamReader(System.in));


        // BufferedReader
        System.out.println("Eingabe durch BufferedReader: ");

        /*
         * Lesevorgang durch den BufferedReader und Speicherung der Eingabe im String `input1`.
         * Beim Lesevorgang mit readLine() könnten potentiell Fehler auftreten. Ein einfaches Beispiels ist hier
         * Das Lesen einer Quelle aus dem Internet ohne Verbindung.
         * Solch ein Verhalten ist zwar die Ausnahme, trotzdem möchte man damit sinnvoll umgehen.
         * Hierbei verwendet man ein try / catch Konstrukt. "Ich versuche etwas auszuführen, scheitert jedoch
         * mein Programm im try Block wird der catch Block aufgerufen".
         * Der catch Block hat noch einen Parameter, hier eine IOException. Die Methode readline() spezifiziert im
         * Methodenkopf "throws IOException", dass bei einem Aufruf diese Exception auftreten könnte.
         * Konrekt wird bei einer Fehlersituation der Code "throw new IOException" aufgerufen, also eine Instanz
         * der Klasse IOException erstellt und geworfen. Exakt diese Instanz wird dann dem catch Block übergeben.
         *
         * Eine IOException ist eine "checked" Exception. Der Compiler checkt, ob diese Exception behandelt wird.
         * Ohne try / catch Konstrukt würde das Programm also nicht kompilieren.
         * Eine andere Möglichkeit wäre die Exception an die aufrufende Methode zu übergeben, dafür würde man in
         * dieser Methode "throws IOException" spezifizieren, genauso wie es in readLine() definiert ist.
         * Die Auswahl der Ausnahmebehandlung kommt auf die Funktionalität der Methode an.
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
        * Ähnlich wie beim BufferedReader kann eine Exception auftreten.
        * Konrekt kann eine NoSuchElementException auftreten, eine "unchecked" Exception.
        * Solche "unchecked" Exceptions werden nicht durch den Compiler überprüft. Das Programm kompiliert zuerst,
        * sobald die Exception auftritt und nicht behandelt wird, stürzt das Programm leider ab.
        * Unchecked Exceptions weisen des öfteren auf Programmierfehler hin, oder signalisieren, dass sich das
        * Programm von dem aufgetretenen Ausnahmeverhalten nicht erholen kann.
        */
        try {
            String input2 = scanner.nextLine();
            System.out.println("Hallo " + input2);
        } catch (NoSuchElementException e) {
            System.err.println("Fehler bei der Eingabe mit dem Scanner!");
        }
    }
}


