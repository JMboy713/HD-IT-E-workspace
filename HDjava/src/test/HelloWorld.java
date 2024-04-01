package test;// package는 관련있는 class들을 하나로 묶는 논리적인 단위이고, 물리적으로는 폴더로 표현된다.

//하나의 java파일에는 public이 붙은 class는 두개이상 존재할 수 없다
// 만약 public class가 존재하면 파일명은 반드시 public class로 설정해야 한다.
public class HelloWorld {
    //field들
    int age;



    // Constructor
    // Constructor는 이름이 클래스 이름과 같다
    // 모양은 method와 유사 return type이 존재하지 않음
    public HelloWorld() {
        // instance의 초기화를 담당하는 일을 주로 한다.

    }
    // 생성자를 기입하지 않으면 javac compliler가 소스코드를 byte코드로 컴파일 할 때
    // default constructor를 새롭게 하나 만들어준다.
    // default constructor는 인자도 없고 하는 일도 없는 생성자.
    // defualt constructor는 반드시 작성해주자.


    // methods
    public void sayHello() {

    }
    // 프로그램의 entry point

    public static void main(String[] args) {
        System.out.println("Hello World");
        // 인스턴스 생성 - heap영역에 인스턴스 생성
        // 레퍼런스 변수가 필요.
        // a는 레퍼런스 variable이라 부른다.
        // Heap영역의 instance의 시작 주소를 가지고 있기 때문이다.
        HelloWorld a = new HelloWorld();
        System.out.println(a);
    }
}
