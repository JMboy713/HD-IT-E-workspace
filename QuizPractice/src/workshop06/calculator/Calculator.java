package workshop06.calculator;

public class Calculator {
    public double plus(int a, int b) {
        return a + b;
    }

    public double minus(int a, int b) {
        return a - b;
    }
    public double multiplication(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("exception 발생하였습니다. 다시 입력해주세요.");
            return 0;
        }
        int result = (int) a / b;
        return (double) result;
    }
}
