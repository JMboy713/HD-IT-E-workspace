package javaexam1;

public class Test04 {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;
        double avg = 0;
        while (i < 101) {
            sum += i;
            i += 1;
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균: " + sum / 100);
    }
}
