package workshop04;

import java.util.ArrayList;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num; i < 11; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                list.add(i);
            }
        }
        int answer = 0;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            answer += next;
            System.out.print(next);
            if (iterator.hasNext()) {
                System.out.print("+");
            }
        }
        System.out.println();
        System.out.println("결과 : "+answer);

    }
}
