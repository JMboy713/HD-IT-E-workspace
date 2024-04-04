package workshop07;

import java.util.Locale;

public class Test02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("JAVAprogram");
        String str = null;
        String first = sb.substring(0, 4);
        String second = sb.substring(4);
        System.out.print(first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase()+second.substring(0,1).toUpperCase()+second.substring(1));
    }
}
