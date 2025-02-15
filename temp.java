import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the temperature : ");
        double temp = scanner.nextDouble();

        if(temp > 40){
            System.out.print("It is hot");
        } else {
            System.out.print("Its not too hot today");
        }

    }
}