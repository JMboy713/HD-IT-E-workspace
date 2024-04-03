package workshop04;


import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("다시 입력하세요");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            if (num1 > 5 || num1 < 1 || num2 > 5 || num2 < 1) {
                System.out.println("숫자를 확인하세요");
            } else {
                int[][] arr = new int[num1][num2];
                Random rand = new Random();
                for (int i = 0; i < num1; i++) {
                    for (int j = 0; j < num2; j++) {
                        arr[i][j] = rand.nextInt(4)+1;
                    }
                }
                double sum = 0;
                for (int[] ints : arr) {
                    for (int anInt : ints) {
                        System.out.print(anInt+" ");
                        sum += anInt;
                    }
                    System.out.println();
                }
                System.out.println("sum=" + sum);
                System.out.println("avg= "+sum/(num1*num2));

            }





        }


        }
}
