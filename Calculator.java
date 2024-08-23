import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
     return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }
    public static void displayOutput(int output){
        System.out.println("output:" + output);
    }
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int a=0,b=0,output=0;
      byte choice;
        do {
            System.out.println("Menu \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Division \n 5.Exit \n Enter your choice(1-5)");
            choice = sc.nextByte();
if(choice>0 && choice<5) {
    System.out.println("Enter first number");
    a = sc.nextInt();
    System.out.println("Enter second number");
    b = sc.nextInt();
}
            switch (choice) {
                case 1:
                    System.out.println("Addition");
                    output = add(a, b);
                    break;
                case 2:
                    System.out.println("Subtraction");
                    output = subtract(a, b);
                    break;
                case 3:
                    System.out.println("Multiplication");
                    output = multiply(a, b);
                    break;
                case 4:
                    System.out.println("Division");
                    output = divide(a, b);
                    break;
                default:
                    System.out.println("invalid");
            }
displayOutput(output);
        }while(choice!=5);
        }
    }

