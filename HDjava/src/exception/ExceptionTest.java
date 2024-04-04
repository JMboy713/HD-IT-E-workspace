package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("일부러 예외상황을 발생시켜 보자.");
//        int result = 10 / 0; // exception 발생 -> 비정상 종료
        //Exception이 발생하면 해당 Exception에 대한 클래스를 찾아서
        // Exception객체를 생성한다.
        // 자동으로 생성된 이 객체를 처리하지 않으면 프로그램이 비정상적으로 종료된다.
        // 만약 이 객체를 프로그램적으로 처리하면
        // ExceptionHandling해서 강제종료를 하지 않는다.
        try {
//            int result = 10 / 0;
            ExceptionTest t = null; // 객체 자체가 없다.
            System.out.println(t.toString());// null point exception

        } catch (ArithmeticException e ) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            // 발생한 예외에 대한 처리코드가 나온다.
            System.out.println(e.getMessage());
        } finally {
            // 있으면 무조건 수행.
            System.out.println("무조건적인 수행 완료");
        }

    }
}
