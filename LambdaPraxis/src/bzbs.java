public class bzbs implements schueler {

    public void lerneigenschaft () {
        System.out.println("lernt für den Lehrmeister");
    }

    @Override
    public String lernen(String v, String n) {
        return v + "lernt für den Lehrmeister" +n;
    }
}
