
import java.util.Scanner;

public class WeekDays{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        
        String WeekdayString = "";

        System.out.print("\n Please enter the number of todays day ");
        int day = scanner.nextInt();

        if (day>1){
            switch(day){
            case 1: WeekdayString = "Monday";                
                break;

            case 2: WeekdayString = "Tuesday";                
                break;

            case 3: WeekdayString = "Wednesday";                
                break;

            case 4: WeekdayString = "Thursday";                
                break;

            case 5: WeekdayString = "Friday";                
                break;
            case 6: WeekdayString = "Saturday";
                break;
            case 7 : WeekdayString = "Sunday";
                break; 
            default: WeekdayString = "Unknown weekday :(";       
                   
        }

        } else{
            System.out.print("\n Day has to be > 0");

        }

        

        System.out.println("\n The day of the week is " + WeekdayString + "\n");
    }
}