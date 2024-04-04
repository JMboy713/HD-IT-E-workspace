package workshop05.mobile;

import com.sun.org.apache.xpath.internal.operations.Lt;

public class MobileTest {
    public static void main(String[] args) {
        Ltab ltab = new Ltab("Ltab",500,"AP-01");
        Otab otab = new Otab("Otab",1000,"AND-20");
        printInfo(ltab, otab);
        ltab.charge(10);
        otab.charge(10);
        printInfo(ltab, otab);
        ltab.operate(5);
        otab.operate(5);
        printInfo(ltab, otab);



    }

    public static void printInfo(Ltab ltab, Otab otab) {
        System.out.println("Moblie       Battery        OS");
        System.out.println("==============================");
        System.out.println(ltab.getMobileName() + "    " + ltab.getBatterySize() + "       " + ltab.getOsType());
        System.out.println(otab.getMobileName() + "    " + otab.getBatterySize() + "       " + otab.getOsType());
    }

}
