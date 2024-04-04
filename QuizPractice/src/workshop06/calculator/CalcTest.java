package workshop06.calculator;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        Calculator calculator = new Calculator();
        double result = 0;
        if (args[1].equals("+")) {
            result= calculator.plus(num1,num2);
        } else if (args[1].equals("-")) {
            result = calculator.minus(num1, num2);
        }else if (args[1].equals("*")) {
            result = calculator.multiplication(num1, num2);
        }else if (args[1].equals("/")) {
            result = calculator.divide(num1, num2);
        }else{
            throw new RuntimeException("연산기호가 아닙니다.");
        }
        System.out.println(result);

    }
}
