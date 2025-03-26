package LambdaAusdruck;

import java.util.ArrayList;
import java.util.List;

public class mainliste {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(12);
        intList.add(23);

        intList.forEach(i -> System.out.println(i));
    }
}