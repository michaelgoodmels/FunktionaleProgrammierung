package LambdaAusdruck;

public class Handwerker implements Mensch {
    public void eigenschaftenFachkraft(){
        System.out.println("Handwerker");
}

@Override
public String eigenschaftenFachkraft(String v, String n) {
    return v + "Handwerker" + n;
    }
}
