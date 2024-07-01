package Jour06.Job14;

public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number lower or equal to 9: ");
        int number = sc.nextInt();

        while(number > 9) {
            System.out.print("Please enter a number lower or equal to 9: ");
            number = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        sc.close();
    }
}
