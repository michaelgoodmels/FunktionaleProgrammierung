/*
Projekt:    Funktionales Programmieren mit Parameter und Rückgabewert
Autor:      Michael Good
Datum:      27.11.2024
e-mail:     michael.good@outlook.com
 */

public class Main {
    public static void main(String[] args) {
        //Lambda-Ausdruck = Abkürzung, um eine Implementierung eines
        //Functional Interfaces zu definieren

        /*
        Schueler schuelerims = (v, n) -> System.out.println(v + "lernen" + n);
        schuelerims.lernen("Die Schuelerinnen und Schueler der IMS ", " gut" );

        //Mit Rückgabewert
        /*Schueler schuelerims = (v, n) -> {
            return v + "lernen" + n;
        };
        */

        //kurze Schreibweise
        Schueler schuelerims = (v, n) -> v + "lernen" + n;

        String s = schuelerims.lernen("Die Schuelerinnen und Schueler der IMS ", " gut" );
        System.out.println(s);
    }
}