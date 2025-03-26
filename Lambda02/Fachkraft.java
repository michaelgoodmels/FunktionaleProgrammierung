package LambdaAusdruck;

public class Fachkraft implements Mensch {
    public void eigenschaftenFachkraft(){
        System.out.println("Schreiner");
}

@Override
public String eigenschaftenFachkraft(String v, String n) {
    return v + "Schreiner" + n;
    }
}
