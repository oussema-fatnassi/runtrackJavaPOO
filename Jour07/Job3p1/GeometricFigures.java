package Jour07.Job3p1;

public class GeometricFigures {    
    public static void main(String[] args) {
        Circle c = new Circle(5, 10, 10);
        System.out.println("Is the point (5, 5) inside the circle ");
        c.show();
        System.out.println(c.isInside(5, 5));
    }
}
