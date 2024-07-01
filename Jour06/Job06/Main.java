package Jour06.Job06;

public class Main {
    public static void main(String[] args) {
            
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int numbers[] = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxNumbers = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > maxNumbers) {
                maxNumbers = numbers[i];
            }
        }
        int secondMaxNumbers = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > secondMaxNumbers && numbers[i] < maxNumbers) {
                secondMaxNumbers = numbers[i];
            }
        }
        System.out.println("The two biggest numbers are: " + maxNumbers + " and " + secondMaxNumbers);

        sc.close();
    }
}
