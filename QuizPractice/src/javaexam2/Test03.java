package javaexam2;

import java.util.StringTokenizer;

public class Test03 {
    public static void main(String[] args) {
        String str = "1.22,4.12,5.93,8.71,9.34";
        double data[] = new double[5];
        double sum = 0;

        // StringTokenizer를 이용해 데이터 꺼냄
        StringTokenizer st = new StringTokenizer(str,",");

        for (int i = 0; st.hasMoreElements() ; i++) {
            data[i] = Double.parseDouble(st.nextToken());
        }

        for (double datum : data) {
            sum += datum;

        }
        System.out.printf("합계 : %.3f",sum);
        System.out.println();
        System.out.println("평균 : "+sum/(data.length));
    }
}
