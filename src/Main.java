public class Main {
    public static void main(String[] args) {

        GenClass<Double> generic = new GenClass();
        generic.setObject(15.3);

        System.out.println(generic.getObject());
    }
}