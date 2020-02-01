package zadanieLista4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(random.nextInt(100)));
        }

        System.out.println(list);

        double suma = 0;
        for (String element : list) {
            suma += Integer.parseInt(element);
        }
        double srednia = suma / list.size();
        System.out.println("Suma elementow: " + suma);
        System.out.println("Srednia elementow: " + srednia);

//        for (int i = 0; i < 100; i++) {
//            if (Integer.parseInt(list.get(i)) > srednia) {
//                list.remove(i);
//            }

//        // OPCJA 1
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()) {
//            String element = it.next();
//            if(Integer.parseInt(element) > srednia) {
//                it.remove();
//            }
//        }
//        System.out.println(list);

        // OPCJA 2
        //kopiujemy elementy do tablicy iterujemy tablice a usuwany z listy
        String[] tablica = new String[list.size()];
        tablica = list.toArray(tablica);

        for (String str : tablica) {
            if (Integer.parseInt(str) > srednia) {
                list.remove(str);
            }
        }
        System.out.println(list);
        
    }
}
