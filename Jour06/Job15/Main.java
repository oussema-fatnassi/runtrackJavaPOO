package Jour06.Job15;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int inversedNumber = 0;
        while (number != 0) {
            inversedNumber = inversedNumber * 10 + number % 10;
            number /= 10;
        }

        System.out.println("The inversed number is: " + inversedNumber);
    }
}
