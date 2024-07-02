package Jour07.Job4p2;

public class Main {
    
    public static void main(String[] args) {
        Plane p = new Plane("Boeing 747", "2011", 100000, "Jet", 1000);
        p.show();
        p.calculateCurrentPrice(2024);
        System.out.println();

        Car c = new Car("Ferrari", "2021", 100000, 2000, 4, 500, 12340);
        c.show();
        c.calculateCurrentPrice(2024);
    }
}
