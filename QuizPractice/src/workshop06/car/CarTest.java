package workshop06.car;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new L3("L3", "1500", 50, 25, 0);
        cars[1] = new L5("L5", "2000", 75, 35, 0);
        printInfO(cars[0], cars[1]);
        for (Car car : cars) {
            car.setOil(25);
        }
        System.out.println();
        System.out.println("25 주유");
        printInfO(cars[0], cars[1]);
        for (Car car : cars) {
            car.go(80);
        }
        System.out.println();
        System.out.println("80 주행");

        printInfO(cars[0], cars[1]);


    }

    public static void printInfO(Car car1,Car car2) {
        System.out.println(" vehicleName engineSize oilTank oilSize distance temperature\n" +
                " ---------------------------------------------------------------------------------");
        L3 l3 = (L3) car1;
        L5 l5 = (L5) car2;
        System.out.println(l3.getName()+" "+l3.getEngine()+" "+l3.getOilTank()+" "+l3.getOilSize()+" "+l3.getDistance()+" "+l3.getTempGage());
        System.out.println(l5.getName()+" "+l5.getEngine()+" "+l5.getOilTank()+" "+l5.getOilSize()+" "+l5.getDistance()+" "+l5.getTempGage());
    }
}
