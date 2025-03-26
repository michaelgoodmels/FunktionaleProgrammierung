package FunctionalProgrammingInterface.Generics;
public class GenClass <T>{
    T objekt;

    public T getObjekt(){
        return objekt;
    }

    public void setObjekt(T neuesObjekt) {
        this.objekt = neuesObjekt;
    }
}
