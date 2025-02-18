// input positive int
// use while to find if prime or not
import java.util.Scanner;

public class Prime{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:  ");

        int n = scanner.nextInt();

        

        if (n < 1){
            System.out.print("\n Please enter a positive number \n");
        }else{

            int i = 1;
            int count = 0;

            while(i <= n){
                if(n % i == 0){
                    count++;
                    i++;
                }
            }
            if(count == 2){
                System.out.print(n + " Is a Prime number");
            }else{
                System.out.print(n + " Is not a prime number");
            }

        }
        
    }
}