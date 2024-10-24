import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

interface Reverse {
    int check(int n);
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse checkReverse = (n) -> {
            int rev = 0;
            while (n != 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n /= 10;
            }
            return rev;
        };

        while (true) {
            try {
                System.out.println("Enter a positive integer: ");
                String input = sc.next();

                // Check if input is a valid integer
                if (!input.matches("\\d+")) {  // Only allow positive integers
                    if (input.matches("-?\\d+")) {
                        throw new InvalidInputException("Negative numbers are not allowed.");
                    }
                    throw new InvalidInputException("Invalid input. Please enter a valid positive integer.");
                }

                int n = Integer.parseInt(input);
                int reversedNumber = checkReverse.check(n);
                System.out.println("Reversed number: " + reversedNumber);
                break; // Break the loop after successful execution
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
            }
        }

        sc.close(); // Close the scanner
    }
}
