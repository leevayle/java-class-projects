import java.util.Scanner;

public class SphereArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the surface area of the sphere
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.printf("The surface area of the sphere is: %.2f%n", surfaceArea);

        // Close the scanner
        scanner.close();
    }
}