package FunctionalProgrammingInterface;

public class App {
    public static void main(String[] args) {
        new App();
    }
    public App() {
        double groesse = 1.70;
        double quadrat = quadriere(a -> a * a, groesse);
        BMIRechner<Double, Double> rechner = gewicht-> gewicht / quadrat;
        double bmi = rechner.rechne(72.0);
        System.out.printf("BMI: %.1f", bmi);
    }
    private double quadriere(BMIRechner<Double, Double> rechner, double a) {
        return rechner.rechne(a);
    }
}
