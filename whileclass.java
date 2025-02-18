public class WhileLoop{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while(i <= 50){

            if (i % 2 != 0){                // System.out.print("\n" + i);

                
                    sum = sum+i;                
                
            }

            i++;
            

        }
        System.out.print("\n" + sum);
    }
}


// We have to increment the value of i before checking the statements again or else it will be an infinite loop
// Odd numbers