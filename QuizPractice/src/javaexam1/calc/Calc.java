package javaexam1.calc;

import static java.lang.Math.abs;

public class Calc {
    public int sum(int a , int b){
        return a + b;
    }
    public int subtract(int a , int b){
        return abs(a - b);
    }
    public int multiply(int a , int b){
        return a * b;
    }
    public int divide(int a , int b){
        if (b <= 0) {
            return 0;
        }
        return a / b;
    }
}
