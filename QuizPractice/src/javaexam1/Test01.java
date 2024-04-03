package javaexam1;

public class Test01 {
    public static void main(String[] args) {
            int num = Integer.parseInt(args[0]);

            if (num % 2 == 0) {
                System.out.println("even number.");
            } else {
                System.out.println("it's not a even number.");
            }

    }
}
