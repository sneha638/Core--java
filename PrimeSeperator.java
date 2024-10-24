import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeSeperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = sc.nextInt();
        }
        List<Integer> numbers = Arrays.stream(inputArray).boxed().collect(Collectors.toList());

        System.out.println("Prime numbers are:");
        numbers.stream()
                .filter(number -> {
                    if (number < 2) return false;
                    for (int i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .forEach(primeNumber -> System.out.println(primeNumber));

        System.out.println("Non-prime numbers are:");
        numbers.stream().filter(number -> {
                    if (number < 2) return true;
                    for (int i = 2; i <= number / 2; i++) {
                        if (number % i == 0) {
                            return true;
                        }
                    }
                    return false;
                })
                .forEach(nonPrimeNumber -> System.out.println("Non-prime numbers are:" + nonPrimeNumber));
    }
}
