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

        System.out.println("문자 개수 " + count);
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                System.out.print(ch+" ");
                count2++;
            }

        }
        System.out.println("단어 개수 : " + count2);

    }
}
