package Jour07.Job3p4;

public class Circle extends Figure{
    protected double radius;
    protected double x;
    protected double y;

    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void show() {
        System.out.println("Radius: " + radius);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean isInside(double x, double y) {
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) < Math.pow(radius, 2);
    }
}