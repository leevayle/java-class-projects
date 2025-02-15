import java.util.Scanner;

public class Remark{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Please enter your age: ");

        int age = scanner.nextInt();
        String remark = "";

        if (age>=1 && age<=150){

            // syntax => condition ? value_if_true : value_if_false

            remark = (age>=18) ? "\n\n :)  Congrats you're an adult!\n\n" : "\n\n Oops you're a minor :(\n\n";
            System.out.print(remark);
            return;
        }else{
            System.out.print("\n\n  Invalid age\n\n");
        }

        scanner.close();
    }
}