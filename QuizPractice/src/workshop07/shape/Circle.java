package workshop07.shape;

import sun.nio.cs.ext.SJIS;

public class Circle extends Shape implements Movable {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x , int y, int radius) {
        super(new Point(x,y));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius/2)*(radius/2)*3.14;
    }

    @Override
    public double getCircumference() {
        return radius*3.14;
    }

    @Override
    public void move(int x, int y) {
        setPoint(new Point(getPoint().getX()+x+1,(getPoint().getY()+y+1)));
    }

    public int getRadius() {
        return radius;
    }

    public String printInfo() {
        return "circle: "+getRadius()+"  "+getPoint().getX()+"   "+getPoint().getY();
    }
}
