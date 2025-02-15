
// IN13/00055/20 KINANGA LEEVAYLE KERINDO 0748673538
// Get the ticket price using a function then print it, it's easier to format the output

import java.util.Scanner;

public class Ticket{
    public static void main(String[] args){

       
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println(" ");
        System.out.print("Are you a member? enter 1 if yes otherwise enter 0 : ");
        int status = scanner.nextInt();

        // Formatting
        System.out.println("");
        System.out.println("");
        System.out.println(" START OF RECEIPT");
        System.out.println("____________________ ");

        price(age,status); 

        // formatting
        System.out.println("-- #TRAVEL SAFE -- ");
        System.out.println(" ");                    

    }


     // Function to determine the ticket value
        static void price(int age,int status){

        // Validate age

        if (age>0){            
        

            // Validate status
            if (status == 1 || status == 0){
                    
                    

                    // Determine the price for the ticket
                    if (age>=0.01 && age<=12 && status==1){                         // age 0-12
                                                        
                        System.out.println("");
                        System.out.println(" Age bracket : 0 - 12. ");
                        System.out.println(" Membership : Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $5 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");
                        
                    }else if (age>=0.01 && age<=12 && status==0){
                        System.out.println(" ");
                        System.out.println(" Age bracket : 0 - 12. ");
                        System.out.println(" Membership : Non-Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $7 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }
                    else if (age>=13 && age<=17 && status==1){                   // age 13 - 17
                        System.out.println(" ");
                        System.out.println(" Age bracket : 13 - 17. ");
                        System.out.println(" Membership : Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $8 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }else if (age>=13 && age<=17 && status==0){
                        System.out.println(" ");
                        System.out.println(" Age bracket : 13 - 17. ");
                        System.out.println(" Membership : Non-Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $10 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }else if (age>=18 && age<=59 && status==1){                   // age 18 - 59
                        System.out.println(" ");
                        System.out.println(" Age bracket : 18 - 59. ");
                        System.out.println(" Membership : Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $12 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }else if (age>=18 && age<=59 && status==0){
                        System.out.println(" ");
                        System.out.println(" Age bracket : 18 - 59. ");
                        System.out.println(" Membership : Non-Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $15 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }else if (age>=60 && age<=150 && status==1){                   // senior citizens
                        System.out.println(" ");
                        System.out.println(" Age bracket : 60 and Above. ");
                        System.out.println(" Membership : Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $6 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }else if (age>=60 && age<=150 && status==0){                   // Senior citizens
                        System.out.println(" ");
                        System.out.println(" Age bracket : 60 and Above. ");
                        System.out.println(" Membership : Non-Member ");
                        System.out.println(" ");
                        System.out.println(" Sub total ");
                        System.out.println("____________________ ");
                        System.out.println(" Total ______ :  $8 ");
                        System.out.println("____________________ ");
                        System.out.println(" ");

                    }else{                      
                        System.out.println(" ");
                        System.out.println(" Invalid age :(");                      // Handle invalid agre entries
                        System.out.println(" ");
                    }


                    // // formatting
                    // System.out.println("-- #TRAVEL SAFE -- ");
                    // System.out.println(" ");

                }else{
                    System.out.println(" Invalid membership status, kindly use 1 for member or 0 for non member.");
                }
        }else{
            // Handling negative values
            System.out.println(" ");
            System.out.println("Age must be atleast___ 1yr :(");
            System.out.println(" ");
        }
           
            
        }
}