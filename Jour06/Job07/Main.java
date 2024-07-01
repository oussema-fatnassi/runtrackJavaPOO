package Jour06.Job07;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int numbers[] = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        double avarage = 0;
        for (int i = 0; i < 5; i++) {
            avarage += numbers[i];
        }
        avarage /= 5;
        System.out.println("The avarage of the numbers is: " + avarage);
        sc.close();
    }
}
