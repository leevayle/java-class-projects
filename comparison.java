import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kindly enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Kindly enter the second number: ");
        int y = scanner.nextInt();

        // Compare the two numbers
        if (x > y) {
            System.out.print(x + " is greater than " + y);
        } else if (x < y) {
            System.out.print(x + " is less than " + y);
        } else {
            System.out.print(x + " is equal to " + y);
        }

        // Close the Scanner object
        scanner.close();
    }
}
