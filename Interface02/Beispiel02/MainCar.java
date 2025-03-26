package FunctionalProgrammingInterface.Beispiel02;

public class MainCar {
    public static void main(String[] args) {

        Cars C450 = new Mercedes("VW", "Golf", "antrhazit", "benzin", 120);
        Cars TT = new Audi("VW", "Golf", "antrhazit", "benzin", 120);
        Cars Golf = new Volkswagen("VW", "Golf", "antrhazit", "benzin", 120);

        //Array mit Autos
        Cars[] Autos = {C450, TT, Golf};

        //for-Schleife zur Übersicht
        for (Cars Auto : Autos){
            //System.out.println(Auto.getClass().toGenericString());
            Auto.marke();
            Auto.type();
            Auto.farbe();
            Auto.treibstoff();
        }
    }
}