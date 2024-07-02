package Jour07.Job3p2;

public class GeometricFigures {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        ColoredRectangle cr = new ColoredRectangle(5, 10, 0);
        System.out.println("The area of the rectangle is: " + ((Rectangle) r).area());
        System.out.println("The color of the colored rectangle is: " + ((ColoredRectangle) cr).getColor());        
    }
}
