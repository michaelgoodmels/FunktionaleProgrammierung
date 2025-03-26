package FunctionalProgrammingInterface.Generics;

public class AusgabeListeKonventionell {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        double[] doubleArray = {0.1, 0.2, 0.3, 0.4};
        char[] charArray ={'J', 'P', 'L'};

        auslesen(intArray);
        auslesen(doubleArray);
        auslesen(charArray);
    }
    public static void auslesen(int[] intArray) {
        for (int zahl : intArray) {
            System.out.println(zahl);
        }
    }
    public static void auslesen(double[] doubleArray) {
        for (double zahl : doubleArray) {
            System.out.println(zahl);
        }
    }

    public static void auslesen(char[] charArray) {
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
