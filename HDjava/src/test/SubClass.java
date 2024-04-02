package test;

public class SubClass extends SuperClass{
    // private은 상속에 안들어간다.
    // 생성자도 상속에 안들어감.
    int a = 5000;
    int c = 500;



    public SubClass() {
        // 현재 내가 최상위 클래스인지 확인하고 아니면 상위 클래스의 instane를 만드는 코드로 돌아가야 한다.
        // 상위 클래스의 생성자를 호출한다. - super
        super(); // 미작성시 javac 가 만들어준다.
    }

    @Override
    public void myFunc() {
        System.out.println("sub class입니다.");
    }
}
