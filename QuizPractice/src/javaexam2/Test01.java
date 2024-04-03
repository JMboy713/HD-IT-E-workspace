package javaexam2;

public class Test01 {
    public static void main(String[] args) {
        int [][] array = {
                {12, 41, 36, 56},
                {82, 10, 12, 61},
                {14, 16, 18, 78},
                {45, 26, 72, 23}
        };
        double sum = 0;

        int count = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
                count += 1;
            }
        }
        System.out.println("합계:" + sum);
        System.out.println("평균: " + sum / count);


    }
}
