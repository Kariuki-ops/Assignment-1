import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User is prompted to enter a number
        System.out.print("Enter any Number: ");
        int number = scanner.nextInt();

        // Checks divisibility by other single-digit integers (0 to 9)
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println("The number " + number + " is divisible by " + i + ".");
            }
        }

        scanner.close();
    }
}