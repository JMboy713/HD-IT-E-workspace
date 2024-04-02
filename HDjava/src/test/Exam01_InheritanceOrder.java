package test;


public class Exam01_InheritanceOrder extends ExSuperClass{
    int c = staticCall("6번 문장");
    static int d = staticCall("7번 문장");

    public Exam01_InheritanceOrder() {
        super(100);
        staticCall("8번 문장");
        super.myFunc();
    }

    @Override
    public void myFunc() {
        System.out.println("9번 문장");
    }

    public static void main(String[] args) {
        System.out.println("10번 문장");
        ExSuperClass obj = new Exam01_InheritanceOrder();
        obj.myFunc();
    }
}
