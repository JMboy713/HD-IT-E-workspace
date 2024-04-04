package workshop07.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(7, 5, 4);
        shapes[1] = new Rectangle(4, 6, 5);
        shapes[2] = new Circle(6, 7, 6);
        shapes[3] = new Circle(8, 3, 7);
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rec = (Rectangle) shape;
                System.out.println(rec.printInfo());
            } else {
                Circle cir = (Circle) shape;
                System.out.println(cir.printInfo());
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rec = (Rectangle) shape;
             rec.move(10,10);
            } else {
                Circle cir = (Circle) shape;
                cir.move(10,10);

            }
        }

        System.out.println("After Move -------------------");
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rec = (Rectangle) shape;
                System.out.println(rec.printInfo());
            } else {
                Circle cir = (Circle) shape;
                System.out.println(cir.printInfo());
            }
        }

    }
}
