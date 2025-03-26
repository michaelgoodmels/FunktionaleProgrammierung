/*
Projekt:    Funktionales Programmieren -> Lambda Ausdruck
Autor:      Michael Good
Datum:      27.11.2024
e-mail:     michael.good@outlook.com
*/

public class Main {
    public static void main(String[] args) {
        //Lambda-Ausdruck = Abkürzung, um eine Implementierung eines
        //Functional Interface zu definieren

        /*
        //Objekt "Schueler" aus Klasse "schueler" erzeugen
        //Schueler schueler = new Schueler(); // geht nicht

        //Anonyme Klasse erstellen mit geschweiften Klammern
        Schueler schueler = new Schueler() { // das geht

            @Override
            public void lernen() {
            System.out.println("lernt gut");
            }
        };
    }
}
*/      //kürzere Schreibweise --> Lambda
        Schueler schueler = () -> System.out.println("lernt weil er angewiesen wird dazu");
        Schueler schuelersek = () -> System.out.println("lernt für die Eltern");
        Schueler schuelerbzbs = () -> System.out.println("lernt für den Lehrmeister");
        Schueler schuelerims = () -> System.out.println("lernt für sich selbst");

        //Methoden
        schueler.lernen();
        schuelersek.lernen();
        schuelerbzbs.lernen();
        schuelerims.lernen();
    }
};

