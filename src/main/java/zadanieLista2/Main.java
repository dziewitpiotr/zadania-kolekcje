package zadanieLista2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();

        for (int i=0; i <10; i++) {
            integerList.add(random.nextInt(10));
        }

//        integerList.sort(Comparator.naturalOrder());
        System.out.println("Lista 10 losowych, posortowanych integerow: " + integerList.toString());

        double suma = 0;
        for (int i = 0; i < integerList.size(); i++) {
            int liczba = integerList.get(i);
            suma = suma+liczba;
        }

        double suma2 = 0;
        for (Integer wartoscZlisty : integerList) {
            suma2 += wartoscZlisty;
        }
        System.out.println("Suma elementow listy to: " + suma);

        System.out.println("Srednia elementow na liscie to: " + suma/integerList.size());

        double srednia;
        double mediana;
        if (integerList.size() % 2 == 0 ) {
            srednia = integerList.get(integerList.size()/2) + integerList.get((integerList.size()/2)+1);
            mediana = srednia/2.0;
        }
        else {
            mediana = integerList.size()/2;
        }

        System.out.println("Mediana elementow na liscie to: " + mediana);


        List<Integer> copy = new ArrayList<>(integerList);

        int min = copy.get(0);
        int max = copy.get(0);

        for (int i = 1; i < copy.size(); i++) {
            if (min > copy.get(i)) {
                min = copy.get(i);
            }
            if (max < copy.get(i)) {
                max = copy.get(i);
            }
        }

        System.out.println("Minimum rowna sie: " + min);
        System.out.println("Maksimum rowna sie: " + max);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < copy.size(); i++) {
            if (min == copy.get(i)) {
                minIndex = i;
            }
            if (max == copy.get(i)) {
                maxIndex = i;
            }
        }
        System.out.println("Indeks minimalnego elementu to: " + minIndex);
        System.out.println("Indeks maksymalnego elementu to: " + maxIndex);

        System.out.println("Indeks minimalnego elementu to: " + copy.indexOf(min));
        System.out.println("Indeks maksymalnego elementu to: " + copy.indexOf(max));


    }


}







