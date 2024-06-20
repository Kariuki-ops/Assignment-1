import java.util.Scanner;
public class SurnameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User enters their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        //User enters their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculates the number of characters in their surname
        int surnameLength = surname.length();

        // Determines if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Results are displayed
        System.out.println("Surname length: " + surnameLength);
        System.out.println("Age is " + ageType);

        scanner.close();
    }
}

