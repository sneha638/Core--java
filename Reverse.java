// Reverse program
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int rev = 0;          
        int sum = 0;          
        int originalNumber = n;         
                while (n != 0) {
            int rem = n % 10;   
            sum += rem;        
            rev = rev * 10 + rem; 
            n /= 10;           
        }
        
     
        System.out.println("Reverse of number " + originalNumber + " is " + rev);
        System.out.println("Sum of digits is " + sum);
        
        sc.close();      }
}
