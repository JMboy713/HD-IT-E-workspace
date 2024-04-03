package javaexam1.calc;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("합: "+calc.sum(num1, num2));
        System.out.println("차: "+calc.subtract(num1, num2));
        System.out.println("곱: "+calc.multiply(num1, num2));
        System.out.println("나누기: "+calc.divide(num1, num2));

    }
}
