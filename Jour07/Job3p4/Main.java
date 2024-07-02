package Jour07.Job3p4;

public class Main {
    
    public static void main(String[] args) {
        Figure r = new Rectangle(10, 20);
        r.setCenter(5, 5);
        r.show();
        System.out.println();
        
        Figure cr = new ColoredRectangle(10, 20, 10);
        cr.setCenter(5, 5);
        cr.show();
        System.out.println();

        Figure c = new Circle(10, 5, 5);
        c.setCenter(5, 5);
        c.show();
    }
}
