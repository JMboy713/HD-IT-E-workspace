package test;

public abstract class TestA {
    // field
    private int age;
    private String name;

    //constructor

    public TestA() {
    }

    public TestA(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    //method
    public void myFunc() {
        // method정의

    }
    public abstract void sayHello(); // 메서드 선언

}

class MySubClass extends TestA {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

}
