class Palindrome {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        int n = 545; // Number to check
        temp = n; // Store the original number in a temporary variable

        // Reverse the number
        while (n > 0) {
            r = n % 10; // Get the last digit
            sum = (sum * 10) + r; // Append last digit to the reversed number
            n = n / 10; // Remove the last digit from the original number
        }

        // Check if the original number is equal to the reversed number
        if (temp == sum) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
