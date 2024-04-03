package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> setTest = new HashSet<>();
        setTest.add("a");
        setTest.add("a");
        setTest.add("b");
        Iterator<String> iter =  setTest.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
