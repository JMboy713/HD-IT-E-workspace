package exception;

class MyException extends Exception {
    
}
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println("사용자 정의 오류 발생");
        }
    }
}
