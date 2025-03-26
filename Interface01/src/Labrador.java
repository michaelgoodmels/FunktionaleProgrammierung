//Interface mit implements integrieren
public class Labrador implements HundInterface {
    int alter;
    String name;
    String farbe;

    public Labrador(int alter, String name, String farbe) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }
    //Methode kommt aus dem Interface
    @Override
    public void bellen() {
        System.out.println("WufWuf");
    }

    @Override
    public void fressen() {
        System.out.println("FressFress");
    }

    @Override
    public void rennen() {
        System.out.println("Geh Geh");

    }
}
