package workshop07.shape;

public class Rectangle extends Shape implements Movable{
    private int width;


    public Rectangle() {
    }

    public Rectangle(int x, int y, int width) {
        super(new Point(x, y));
        this.width = width;
    }

    @Override
    public void move(int x, int y) {
        setPoint(new Point(getPoint().getX()+x+2,(getPoint().getY()+y+2)));

    }

    @Override
    public double getArea() {
        return width*width;
    }

    @Override
    public double getCircumference() {
        return width*4;
    }

    public int getWidth() {
        return width;
    }

    public String printInfo() {
        return "Rectangle: "+getWidth()+"  "+getPoint().getX()+"   "+getPoint().getY();

    }
}
