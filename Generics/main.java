package FunctionalProgrammingInterface.Generics;

public class main {
    public static void main(String[] args) {
        GenClass<Double> generic = new GenClass();
        generic.setObjekt(15.3);
        System.out.println(generic.getObjekt());
    }
}
