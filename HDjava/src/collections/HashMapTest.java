package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one", "hyundai");// 저장.
        System.out.println(map.get("one")); // 키값으로 가져오기

    }
}
