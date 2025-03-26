/*
Projekt:    Funktionales Programmieren Lambda Praxis
Autor:      Michael Good
Datum:      27.11.2024
e-mail:     michael.good@outlook.com
 */

public class Main {
    public static void main(String[] args) {
        //Lambda-Ausdruck = Abkürzung, um eine Implementierung eines
        //Functional Interfaces zu definieren

        /* Herleitung
        //Objekt vom Typ schueler erstellen

        schueler ims = new ims();

        //Methode ims übergeben
        lernbereitschaft(ims);
        */

        //Anonyme Klasse durch Lambda-Ausdruck ersetzen
        lernbereitschaftims((v,n) -> v + "lernen für sich selbst" + n);
        lernbereitschaftbzbs((v,n) -> v + "lernen für den Lehrbertrieb" + n);
        lernbereitschaftsekundar((v,n) -> v + "lernen für seine Eltern" + n);


    }
    public static void lernbereitschaftims(schueler ims){
        String s = ims.lernen("Die Schuelerinnen und Schueler der ims ", " !!!");
        System.out.println(s);
    }

    public static void lernbereitschaftbzbs(schueler bzbs){
        String s = bzbs.lernen("Die Schuelerinnen und Schueler der des bzbs ", " !!!");
        System.out.println(s);
    }

    public static void lernbereitschaftsekundar(schueler sekundar){
        String s = sekundar.lernen("Die Schuelerinnen und Schueler der sekundarschule ", "!!!");
        System.out.println(s);
    }
}