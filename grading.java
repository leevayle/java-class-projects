import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();
        

        // Give grades acccording to score

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("");
                System.out.println("Grade: A");
                System.out.println("");
            } else if (score >= 80) {
                System.out.println("");
                System.out.println("Grade: B");
                System.out.println("");
            } else if (score >= 70) {
                System.out.println("");
                System.out.println("Grade: C");
                System.out.println("");
            } else if (score >= 60) {
                System.out.println("");
                System.out.println("Grade: D");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("Grade: F");
                System.out.println("");
            }
        } else {
            System.out.println("Score must be between 1 and 100");
        }

        scanner.close();
    }
}