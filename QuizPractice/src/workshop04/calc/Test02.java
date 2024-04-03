package workshop04.calc;

public class Test02 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int number = Integer.parseInt(args[0]);
        System.out.println("결과 " + calc.calculate(number));
    }

}
