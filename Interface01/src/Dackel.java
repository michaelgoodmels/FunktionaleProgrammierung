//Interface mit implements integrieren
public class Dackel implements HundInterface {

    private int beine = 4;
    int alter;
    private String name;
    int gewicht;

    public Dackel(int alter, String name, int gewicht) {
        this.alter = alter;
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void bellen() {
        System.out.println("Wau Wau");
    }

    @Override
    public void fressen() {
        System.out.println("Mampf Mampf");
    }

    @Override
    public void rennen() {
        System.out.println("Lauf Lauf");

    }
}
