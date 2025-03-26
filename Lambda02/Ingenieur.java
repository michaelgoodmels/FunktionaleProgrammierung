package LambdaAusdruck;

public class Ingenieur implements Mensch {
    public void eigenschaftenFachkraft(){
        System.out.println("Ingenieur");
}

@Override
public String eigenschaftenFachkraft(String v, String n) {
    return v + "Ingenieur" + n;
    }
}
