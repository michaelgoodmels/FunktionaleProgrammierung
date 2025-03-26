//Interfaces
public class Main {
    public static void main(String[] args) {
        //Klasse -> Superklasse
        //Klasse -> Interface *

        //Name von Klasse durch HundInterface ersetzen
        HundInterface molly = new Labrador(5, "molly", "weiss");
        HundInterface bruno = new Dackel(10, "bruno", 6);
        HundInterface senta = new Schaeferhund();
        //Hundinerface erstellen
        HundInterface[] hunde = {molly, bruno, senta};

        for (HundInterface hund : hunde) {
            System.out.println(hund.getClass().toString());

            molly.rennen();
            senta.rennen();
            bruno.rennen();

        }
    }
}