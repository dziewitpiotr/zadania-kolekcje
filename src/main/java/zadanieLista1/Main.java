package zadanieLista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> integerList = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            integerList.add(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            integerList.add(random.nextInt(20));
        }

        System.out.println(integerList.toString());


    }
}
