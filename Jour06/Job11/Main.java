package Jour06.Job11;

public class Main {
    public static void main(String[] args) {
        int number = 8;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
