import java.util.Scanner;

public class challenge{
    public static void main(String[] args) {
        // 1. Print 5 10 15 ... 50
        System.out.println("1) Multiples of 5 up to 50:");
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. Print 10 9 8 ... 1
        System.out.println("2) Countdown from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 3. Print 1 4 9 ... 100
        System.out.println("3) Squares of 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println("\n");

        // 4. Calculate n! (Factorial)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = input.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }
}
