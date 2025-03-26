public class ims implements schueler {

    public void lerneigenschaft () {
        System.out.println("lernt für sich selbst");
    }

    @Override
    public String lernen(String v, String n) {
        return v + "lernt für sich selbst" +n;
    }
}
