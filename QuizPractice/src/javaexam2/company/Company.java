package javaexam2.company;

import java.util.HashMap;
import java.util.Set;

public class Company {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();
        Secretary secretary = new Secretary("Hilery",1,"secretary",800);
        Sales sales = new Sales("Clinten",2,"sales",1200);
        map.put(sales.getNumber(), sales);
        map.put(secretary.getNumber(), secretary);
        printInformation(map);
        System.out.println();
        System.out.println("인센티브 100 지급");
        sales.incentive(100);
        secretary.incentive(100);
        map.put(sales.getNumber(), sales);
        map.put(secretary.getNumber(), secretary);
        System.out.println("name             department           salary           tax");
        System.out.println("----------------------------------------------------------");
        for (Employee value : map.values()) {
            double tax = value.tax();
            System.out.println(value +"     "+tax);

        }

    }

    public static void printInformation(HashMap map) {
        System.out.println("name             department           salary");
        System.out.println("--------------------------------------------");
        for (Object value : map.values()) {
            System.out.println(value);
        }
    }
//    public static void printInformation2(HashMap map) {
//        System.out.println("name             department           salary           tax");
//        System.out.println("----------------------------------------------------------");
//        for (Object value : map.values()) {
//            double tax = value.tax();
//            System.out.println(value +"     "+tax);
//        }
//    }
}
