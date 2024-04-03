package classes;

import java.lang.String;
public class Student {
    // field
    private String name;
    private int age;

    // constructor

    public Student() {
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //method

    @Override
    public boolean equals(Object obj) {
        //인자로 들어온 객체 - Object ( 모든 객체가 들어올 수 있다.)
        // 인자로 들어온 인스턴스가 equals method를 가지고 있는 인스턴스의 내용과 같으면 같은 객체로 판별하는 로직
        // 두 인스턴스의 데이터 타입이 같아야 하기 때문에 맞춰주어야 한다.
        Student target = (Student) obj;

        if(this.getName().equals(target.getName())&& this.getAge()== target.getAge()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getName() + ":" + this.getAge();
    }
}

class MyTest {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동",20);
        Student s2 = new Student("홍길동",20);
        boolean result = s1 == s2; // 변수 안의 값이 같은가? - 메모릭 주소값을 비교
        System.out.println(result);
        System.out.println(s1.equals(s2)); // 객체가 같은가
        System.out.println(s1);
        System.out.println(s1.toString());

    }
}
