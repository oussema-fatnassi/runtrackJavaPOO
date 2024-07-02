package Jour07.Job3p4;

public class Figure {
    private double x;
    private double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void show() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }
}