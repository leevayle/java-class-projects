import java.util.Scanner;

public class Prime2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Input a number: " );

        int n = scanner.nextInt();
        

        // Validate user input

        if( n < 1){
            System.out.print("\n Please enter a positive number ");
        }else{

            int i = 1; 
            int count = 0;

            // Iterate 1 through n to find divisible numbers and record them in count

            while(i <= n){
                if(n % i == 0){
                    count++;
                    i++;
                }else{
                    i++;
                }
            }

            if(count == 2){
                System.out.print(n + "\n is a prime number----- \n");
            }else{
                System.out.print(n + "\n is not a prime  xxxxx \n");
            }


        }


    }
}