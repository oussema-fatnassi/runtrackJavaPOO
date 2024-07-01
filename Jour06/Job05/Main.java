package Jour06.Job05;

public class Main {
    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        number = number * number;
        System.out.println("The square of the number is: " + number);
        sc.close();
    }
}
