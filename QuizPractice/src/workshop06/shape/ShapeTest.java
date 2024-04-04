package workshop06.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape[] = new Shape[6];
        shape[0] = new Triangle(7,5,"Blue");
        shape[2] = new Triangle(6,7,"Red");
        shape[4] = new Triangle(9,8,"White");
        shape[1] = new Rectangle(4,6,"Blue");
        shape[3] = new Rectangle(8,3,"Red");
        shape[5] = new Rectangle(5,7,"White");


        System.out.println("기본 정보");
        for (Shape shape1 : shape) {
            if (shape1 instanceof Triangle) {
                System.out.println("Triangle  "+shape1.getArea()+" "+shape1.getColors());
            }else if (shape1 instanceof Rectangle) {
                System.out.println("Rectangle  "+shape1.getArea()+" "+shape1.getColors());
            }
        }
        for (Shape shape1 : shape) {
            if (shape1 instanceof Triangle) {
                Triangle triangle = (Triangle) shape1;
                triangle.setResize(5);
            }else if (shape1 instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape1;
                rectangle.setResize(5);

            }
        }
        System.out.println();
        System.out.println("사이즈 변경 후 정보");
        for (Shape shape1 : shape) {
            if (shape1 instanceof Triangle) {
                System.out.println("Triangle  "+shape1.getArea()+" "+shape1.getColors());
            }else if (shape1 instanceof Rectangle) {
                System.out.println("Rectangle  "+shape1.getArea()+" "+shape1.getColors());
            }
        }




    }
}
