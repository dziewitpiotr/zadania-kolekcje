package zadanieLista3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("33", "22", "15", "50");
        List<String> list = new ArrayList<>(Arrays.asList("33", "22", "15", "50"));
        list.add("66");

        System.out.println(list);
        System.out.println("Indeks elementu 15 to: " + list.indexOf("15"));
        System.out.println("Czy lista zawiera element 22: " + list.contains("22"));
        list.remove("66");
        System.out.println("Lista po usunieciu 66: " + list);
        for (String elementy : list) {
            System.out.print(elementy + ", ");
        }
        System.out.println();
        for (String elementy : list) {
            System.out.println(elementy);
        }
    }
}
