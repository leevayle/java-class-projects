
// IN13/00055/20 KINANGA LEEVAYLE KERINDO 2.2 KSU

import java.util.Scanner;

public class Ticket{
    public static void main(String[] args){

        // get inputs from the user

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        double age = scanner.nextDouble();

        System.out.print("Are you a member? Enter 1 if yes and 0 for no : ");
        int status = scanner.nextInt();


        //validate age so we dont receive negatives and age above 150
        if (age<=0 || age>150){
                System.out.print("\n\n          :(");
                System.out.print("\n\n Invalid age. Please enter a valid age.\n\n\n");
                return ;
            }


        // Validate status
        if (status !=0 && status !=1){
            System.out.print("Invalid Membership status, use 1 for member or 0 for non-member. \n");
            return ;

            }


        
        printTicket(age, status);
        
        
        
    }

    // fn to handle the print logic and formatting
    static void printTicket(double age, int status){
        int price = getPrice(age, status);

            System.out.print("\n\n=============================\n     THE LEENT AIRLINES");
            System.out.print("\n-----------------------------\n\n");
            System.out.print("  Age    :   "+ age );
            System.out.print("\n  Status :  "+ ((status == 1) ? " Member" : " Non-Member"));
            System.out.print("\n  Tax    :   "+"$"+ "0");
            System.out.print("\n  Price  :  "+" $"+ price);
            System.out.print("\n\n\n-----------------------------\n");
            System.out.print("  Total  :   "+"$"+ price+"\n");
            System.out.print("-----------------------------\n\n");
            System.out.print("  # IN13/00055/20 \n  # TRAVEL SAFE!");
            System.out.print("\n=============================\n\n");

        }


        // fn to calculate the price based on age and membership status
        static int getPrice(double age, int status){
            

            int price = 0;


            if (age<=12){
                 price = (status == 1) ? 5 : 7;
            }else if(age<=17){
                price = (status == 1) ? 8 : 10;
            }else if(age<=59){
                price = (status == 1) ? 12 : 15;
            }else if(age>=60){
                price = (status == 1) ? 6 : 8;
            }    

            return price;

        }

    }