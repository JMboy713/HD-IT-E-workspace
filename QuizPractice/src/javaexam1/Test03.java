package javaexam1;

public class Test03 {
    public static void main(String[] args) {
        for (int i = 3; i < 6; i++) {
            for (int j = 1; j <= 9; j+=2) {
                if ((i * j) % 2 == 1) {
                    System.out.println(i+"*"+j+"="+i*j);
                }
            }

        }
    }
}
