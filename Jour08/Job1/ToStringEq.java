package Jour08.Job1;

public class ToStringEq {
    
    public static void main(String[] args) {
        System.out.println("Test 1: ");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2: ");
        ColoredRectangle rect1 = new ColoredRectangle(12.5, 4.0, "red");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3: ");
        Rectangle rect2 = new ColoredRectangle(25.0/2, 8.0/2, new String("red"));
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect1));
        System.out.println(rect1.equals(null));
        System.out.println(rect.equals(rect1));
        System.out.println(rect1.equals(rect));
    }
}
