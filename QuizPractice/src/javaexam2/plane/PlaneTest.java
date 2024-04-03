package javaexam2.plane;

public class PlaneTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("L747",1000);
        Cargoplane cargoplane = new Cargoplane("C40",1000);
        printInformation(airplane,cargoplane);
        System.out.println("100 운항");
        airplane.flight(100);
        cargoplane.flight(100);
        printInformation(airplane,cargoplane);
        System.out.println("200 주유");
        airplane.refuel(200);
        cargoplane.refuel(200);
        printInformation(airplane,cargoplane);
    }

    public static void printInformation(Airplane airplane, Cargoplane cargoplane) {
        System.out.println("plane               fuelsize");
        System.out.println("============================");
        System.out.println(airplane);
        System.out.println(cargoplane);
        System.out.println();

    }
}
