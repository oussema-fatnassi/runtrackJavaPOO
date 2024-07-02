package Jour07.Job3p1;

public class Circle {
    protected double radius;
    protected double x;
    protected double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("Radius: " + radius);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInside(double x, double y) {
        return Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) < Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}