package test;

public class MyInterfaceSub implements MyInterface{
    @Override
    public void myFunc() {
        System.out.println("say hello");
    }

    public MyInterfaceSub() {
    }

    public static void main(String[] args) {
        MyInterfaceSub myInterfaceSub = new MyInterfaceSub();
        myInterfaceSub.myFunc();
    }
}
