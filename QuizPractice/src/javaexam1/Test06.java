package javaexam1;

public class Test06 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        for (int i : array) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }
            }
        System.out.println("합계 : " + sum);

    }
}
