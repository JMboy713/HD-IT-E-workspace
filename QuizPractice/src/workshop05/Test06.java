package workshop05;

import java.util.Locale;

public class Test06 {
    public static void main(String[] args) {
        String str = "JAVAProgramming";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(4));
    }
}
