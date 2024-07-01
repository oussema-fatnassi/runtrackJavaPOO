package Jour06.Job13;

public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        for (int i = 0; i <= number; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
