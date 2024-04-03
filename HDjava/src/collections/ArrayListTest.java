package collections;

import java.util.ArrayList;
import java.util.List;

class MyStudent{
    @Override
    public String toString() {
        return "student";
    }
}

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList객체를 만들어서 사용해 보자.
        // List계열은 객체면 type에 상관없이 다 저장이 가능하다.
        // 다른 reference data type을 저장할 수 있다.
        // 실제 구현하다 보면 같은 데이터 타입을 이용해서 사용하게 됨 - generics
        List list = new ArrayList();
        list.add("1번");
        list.add(new MyStudent());
        list.add(100); // int 형태의 primitive type. 원칙적으로 들어갈 수 없다.
        // java에는 primitive type에 각각 대응되는 wrapper 클래스가 존재한다.
        // list.add(100) -> list.add(new Integer(100));
        for (Object o : list) {
            System.out.println(o);
        }
        List<String> myList = new ArrayList<>();
        myList.add("1");
        for (String s : myList) {
            System.out.println(s);
        }
    }
}
