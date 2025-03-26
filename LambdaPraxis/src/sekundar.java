public class sekundar implements schueler {

    public void lerneigenschaft () {
        System.out.println("lernt für die Eltern");
    }

    @Override
    public String lernen(String v, String n) {
        return v + "lernt für die Eltern" +n;
    }
}
