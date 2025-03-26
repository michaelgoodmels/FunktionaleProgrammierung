package FunctionalProgrammingInterface.Beispiel02;

public class Audi implements Cars {

    String marke;
    String type;
    String farbe;
    String treibstoff;
    int ps;

    public Audi(String marke, String type, String farbe, String treibstoff, int ps) {
        this.marke =marke;
        this.type =type;
        this.farbe =farbe;
        this.treibstoff =treibstoff;
}

    @Override
    public void marke(){
        System.out.print("AUDI ");
    }

    @Override
    public void type(){
        System.out.print("TT ");
    }

    @Override
    public void farbe(){
        System.out.print("rot ");
    }

    @Override
    public void treibstoff(){
        System.out.print("hybrid ");
    }

    @Override
    public void ps(){
        System.out.print("320 ");
    }
}
