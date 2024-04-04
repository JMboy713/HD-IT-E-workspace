package workshop06.calc;

public class Test01 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num < 5 || num > 10) {
            System.out.println("다시 입력하세요");
        } else {
            Calc calc = new Calc();
            System.out.println(calc.calculate(num));
        }
    }
}
