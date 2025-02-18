public class Odd{
    public static void main(String[] args){

        // find all odd numbers from 0 - 20

        int i = 1;


        while(i <= 20){
            if(i % 2 == 0){
                
                i++;
            }else{
                System.out.print("\n " + i);
                i++;
            }
        }
    }
}
// Check if there is a value remaining after division with 2 if yes its odd