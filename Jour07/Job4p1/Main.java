package Jour07.Job4p1;

public class Main {
    
    public static void main(String[] args) {
        Plane p = new Plane("Boeing 747", "20-01-2021", 100000, "Jet", 1000);
        p.show();
        System.out.println();

        Car c = new Car("Tesla Model Y", "20-01-2021", 100000, 2000, 4, 500, 12340);
        c.show();
    }
}
