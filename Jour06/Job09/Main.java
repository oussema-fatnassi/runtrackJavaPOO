package Jour06.Job09;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int cubeSum = 0;
        for (int i = 1; i <= number; i++) {
            cubeSum += i * i * i;
        }
        System.out.println("The sum of the cubes of the numbers from 1 to " + number + " is: " + cubeSum);
        sc.close();
    }
}
