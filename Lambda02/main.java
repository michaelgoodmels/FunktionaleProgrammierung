package LambdaAusdruck;

public class main {
    public static void main(String[] args) {

        rufeMethodeHandwerkerAuf((v, n) -> v + " Schreiner " + n);
        rufeMethodeIngenieurAuf((v, n) -> v + " Softwareentwickler " + n);
        rufeMethodeArztAuf((v, n) -> v + " Chirurg " + n);
    }

    public static void rufeMethodeHandwerkerAuf(Mensch mensch) {
        //Handwerker
        String h = mensch.eigenschaftenFachkraft("Ein guter", "arbeitet genau!");
        System.out.println(h);
    }
    public static void rufeMethodeIngenieurAuf(Mensch mensch) {
        //Ingenieur
        String i = mensch.eigenschaftenFachkraft("Ein seriöser", "arbeitet gewissenhaft!");
        System.out.println(i);
    }
    public static void rufeMethodeArztAuf(Mensch mensch) {
        //Arzt
        String a = mensch.eigenschaftenFachkraft("Ein routinierter", "arbeitet ruhig!");
        System.out.println(a);
    }
}