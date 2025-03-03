public class Prime{
    
    public static void main (String[] args){

       // loop through all numbers from 1 - 50 
       // check if theyre divisible by only 1 and the number itself
       //Mark the ones that meet this requirememnt

       // this are the prime numbers the others are not
       // add those together get the sum and display it

       int i = 1;
       int n = 2;
       int count = 0;

       //loop through 50
       while(i <= 50){
        

        if(n % i == 0){
            
            System.out.print("\n Got it " + i);
            i++;
            count++;
        }

        

       }
       n++;

    }
}