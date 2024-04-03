package javaexam2;

import java.util.HashMap;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int iValue = random.nextInt(100);
            map.put(i, iValue);
        }
        for (Integer value : map.values()) {
            System.out.print(value+" ");
        }
        System.out.println();
        double sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + sum / 10);

    }
}
