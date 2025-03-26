import java.util.function.Function;

public class Main {
    // Höhere Ordnungsfunktion: Nimmt eine Funktion als Parameter und gibt eine neue Funktion zurück
    public static Function<Integer, Integer> applyOperation(Function<Integer, Integer> operation) {
        return (x) -> operation.apply(x) + 10;
    }

    public static void main(String[] args) {
        // Definiert eine Funktion: Multiplikation mit 2
        Function<Integer, Integer> multiplyByTwo = (x) -> x * 2;

        // Übergibt die Funktion an die höhere Ordnungsfunktion
        Function<Integer, Integer> newOperation = applyOperation(multiplyByTwo);

        // Verwendet die neue Funktion
        Integer result = newOperation.apply(5);
        System.out.println(result);  // Ausgabe: 20 (5 * 2 + 10)
    }
}


/*
Detaillierte Erklärung:
applyOperation: Diese Methode ist eine höhere Ordnungsfunktion, da sie eine Funktion (vom Typ Function<Integer, Integer>) als Eingabeparameter erhält und eine neue Funktion desselben Typs zurückgibt. Die zurückgegebene Funktion führt die ursprüngliche Funktion (über operation.apply(x)) aus und fügt 10 zum Ergebnis hinzu.

multiplyByTwo: Hier wird eine Lambda-Funktion definiert, die eine Zahl mit 2 multipliziert. Sie wird als Argument an die höhere Ordnungsfunktion applyOperation übergeben.

newOperation: Die Funktion, die von applyOperation zurückgegeben wird, ist eine neue Funktion, die zuerst die ursprüngliche Funktion ausführt (Multiplikation mit 2) und dann 10 addiert. Wenn diese Funktion auf 5 angewendet wird, lautet das Ergebnis 5 * 2 + 10 = 20.

Wichtige Konzepte der funktionalen Programmierung:
Funktionen als Parameter: Funktionen können in Java als Parameter übergeben werden, indem man funktionale Schnittstellen wie Function<T, R> verwendet. Hier repräsentiert die Schnittstelle eine Funktion, die einen Wert vom Typ T akzeptiert und einen Wert vom Typ R zurückgibt.

Immutabilität: In der funktionalen Programmierung ist es üblich, dass Daten unveränderlich sind. Statt Daten zu ändern, wird ein neuer Wert zurückgegeben. In diesem Beispiel wird der ursprüngliche Wert 5 nicht verändert, sondern ein neuer Wert (das Ergebnis) berechnet.

Funktionale Komposition: Durch die Rückgabe einer Funktion können Funktionen kombiniert und zu komplexeren Operationen zusammengesetzt werden.

Dieses Konzept der höheren Ordnungsfunktionen hilft dabei, Code modularer und flexibler zu gestalten, insbesondere bei der Verarbeitung von Daten oder der Implementierung von wiederverwendbaren Funktionsbausteinen.
 */