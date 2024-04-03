package javaexam1;

public class Test02 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if (num1 * num2 >= 10) {
            System.out.println("두자리 수 입니다.");
        }else{
            System.out.println("한자리 수 입니다.");
        }

    }
}
