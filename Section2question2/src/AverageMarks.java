import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] unitNames = {
                "Entrepreneurship",
                "Financial Management for IT",
                "Programming methodology",
                "Data structures and algorithm",
                "Fundamentals of computer networks"
        };

        double[] marks = new double[5];
        double totalMarks = 0;

        for (int i = 0; i < 5; i++) {
            //User is asked to enter the marks for all units
            System.out.print("Enter marks for " + unitNames[i] + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }
            //The average for all the 5 units is found and displayed
        double average = totalMarks / 5;
        System.out.printf("Average marks: %.2f%n", average);

        scanner.close();
    }
}
