package Jour06.Job10;

public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
        sc.close();
    }
}
