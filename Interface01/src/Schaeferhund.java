//Interface mit implements integrieren
public class Schaeferhund implements HundInterface {

    @Override
    public void bellen() {
        System.out.println("Wuu Wuu");
    }

    @Override
    public void fressen() {
        System.out.println("Mampf Mampf");
    }

    @Override
    public void rennen() {
        System.out.println("Renn Renn");

    }
}
