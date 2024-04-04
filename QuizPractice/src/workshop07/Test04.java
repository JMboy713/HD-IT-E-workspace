package workshop07;

import java.util.StringTokenizer;

public class Test04 {
    public static void main(String[] args) {
        String str = "I am second to none";
        StringTokenizer st = new StringTokenizer(str);
        int count = 0;
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken()+"  ");
            count += 1;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str);
        }
    }
}
