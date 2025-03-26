package FunctionalProgrammingInterface.Beispiel02;

public class Mercedes implements Cars {

    String marke;
    String type;
    String farbe;
    String treibstoff;
    int ps;

    public Mercedes(String marke, String type, String farbe, String treibstoff, int ps) {
        this.marke =marke;
        this.type =type;
        this.farbe =farbe;
        this.treibstoff =treibstoff;
}

    @Override
    public void marke(){
        System.out.print("VW ");
    }

    @Override
    public void type(){
        System.out.print("Golf ");
    }

    @Override
    public void farbe(){
        System.out.print("grau ");
    }

    @Override
    public void treibstoff(){
        System.out.print("benzin ");
    }

    @Override
    public void ps(){
        System.out.print("120 ");
    }
}
