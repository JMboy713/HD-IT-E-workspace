package test;

public class Main {
    public static void main(String[] args) {
        //인스턴스를 생성.
        SubClass sub = new SubClass();
        SuperClass sub2 = new SubClass(); // referencing super class. 슈퍼클래스를 바라본다.
        // Object 도 가능하다. => polymorphism
        System.out.println("c의 값은 : "+sub.c);
        System.out.println("a의 값은 : "+sub.a);
        System.out.println("super의 a값: "+sub2.a);
        sub.myFunc();

    }
}
