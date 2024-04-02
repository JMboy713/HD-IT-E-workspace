package test;

public class MyTest {
    // 필드들
    private int a = 100;// 인스턴스 생성 전까지 a 사용 불가. instance variable이라고 칭함.
                // 메모리 힙 영역에 만들어짐.

    private static int b = 200; // class variable. method area에 만들어짐.

    private int c = 300;
    // 생성자

    static{
        // static block.
    }

    public MyTest() {
    }

    public MyTest(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    // 메서드

    public static void main(String[] args) { // static = instance를 만들지 않고도 main을 실행
        // 위에 있는 필드를 사용하려면 인스턴스가 존재해야 한다.
        MyTest obj = new MyTest();// reference variable을 사용해 인스턴스를 사용할 수 있다.
        // obj 라는 레퍼런스 variable을 이용해 heap 영역에 생성된 instance를 사용할 수 있다.
        // reference variable을 이용해 instance를 사용할 때 이용하는 연산자가 있다.
            // dot operator (.)
        System.out.println("a = "+obj.a);

        System.out.println("b="+b);
        int k = 200; // 메서드 내에 정의된 변수로 스택 영역에 생기는 변수.local variable

    }
}
