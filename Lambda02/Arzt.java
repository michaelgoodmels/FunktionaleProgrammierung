package LambdaAusdruck;

public class Arzt implements Mensch {
    public void eigenschaftenFachkraft(){
        System.out.println("Arzt");
}

@Override
public String eigenschaftenFachkraft(String v, String n) {
    return v + "Arzt" + n;
    }
}
