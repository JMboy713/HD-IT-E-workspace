package javaexam2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int iValue = rand.nextInt(10);
            list.add(iValue);
        }
        Collections.sort(list);

        for (Integer o : list) {
            System.out.println(o);
        }
    }
}
