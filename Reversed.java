
    import java.util.*;
    class InvalidInputException extends Exception {
        public InvalidInputException (String message){
            super(message);
        }
    }
    @FunctionalInterface
    interface Reverse{
        int check(int n);
    }
    class Reversed {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            Reverse check = (n)-> {
                int rev =0;
                //for (; n!= 0; n= n/10){
                while(n!= 0){
                    int digit = n % 10;
                    rev = rev * 10 + digit;
                    n /= 10;
                }
                return rev;
            };
            while (true){
                try{
                    System.out.println("Enter number: ");
                    String input = Scanner.nextLine();
                    int n = Integer.parseInt(input);
                    int reversednumber =check.check(n);
                    System.out.println("reversed number " + reversednumber);
                    break;
                }
                catch (InvalidInputException e){
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
