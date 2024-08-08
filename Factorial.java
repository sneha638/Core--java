import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Close the scanner object to prevent resource leaks
        sc.close();

        if (n < 0) {
            System.out.println("Invalid");
        } else {
            int i, f = 1;
            for (i = 1; i <= n; i++) {
                f = f * i;
            }

            System.out.println("Factorial is " + f);
        }
    }
}
