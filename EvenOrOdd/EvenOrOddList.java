package EvenOrOdd;
import java.util.Arrays;
import java.util.Scanner;
public class EvenOrOddList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to check : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
          numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
           if (number % 2 == 0) {
             System.out.println(number + " is even.");
        } else {
             System.out.println(number + " is odd.");
         }
    }
scanner.close();

 }
}
