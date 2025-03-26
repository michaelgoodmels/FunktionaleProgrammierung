import java.lang.reflect.Type;

public class Generics {
        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4};
            Double[] doubleArray = {0.1, 0.2, 0.3, 0.4};
            Character[] charArray = {'J', 'P', 'L'};

            auslesen(intArray);
            auslesen(doubleArray);
            auslesen(charArray);
        }

        public static <Type> void auslesen(Type[] typeArray) {
            for (Type t : typeArray) {
                System.out.println(t);
            }
        }
    }

