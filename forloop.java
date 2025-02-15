
import java.util.Scanner;

public class Incrememnt{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Enter a number: ");
        int num = scanner.nextInt();

        for(int i=0; i<18; ++i){

            if (num <= 18){
                System.out.print(" \n" + ++num);
            }else{
                System.out.print(" \n" + num);
            }
        }
    }
}