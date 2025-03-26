public class Main {
    public static void main(String[] args) {
        //was ist eine anonyme Klasse?
        //Namenlose Klasse, die gleichzeitig initialisiert und deklariert wird

        //1. Klasse erweitern
        Katze katze = new Katze(){
            @Override
            public void macheMiau() {
                //Methode mit Wau überschreiben --> Anonyme Klasse (Unterklasse)
                //wichtig sind die geschweiften Klammern!
                //erweitert die Klasse Katze mit Wau
                //wird nur einmal aufgerufen
                System.out.println("Wau");
            }
        };
        //Methode aufrufen
        katze.macheMiau();

        //2. Interface implementieren
        Lebewesen affe = new Lebewesen() {
            @Override
            public void macheEtwas() {
                System.out.println("UhUhAga");
            }
        };
        affe.macheEtwas();
    }
}