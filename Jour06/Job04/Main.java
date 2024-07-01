package Jour06.Job04;

public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
        sc.close();
    }
}
