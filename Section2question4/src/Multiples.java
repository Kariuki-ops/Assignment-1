public class Multiples {
    public static void main(String[] args) {
        int start = 71;
        int end = 150;

        System.out.println("Multiples of 2, 3, and 7 within the range " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}