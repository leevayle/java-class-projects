// syntax while(condition){ Code to be executed; increment i after that}

public class WhileLoop{
    public static void main(String[] args){
        // Print from 1 - 9
        int a = 1;
        while(a < 10){
            System.out.print("\n " + a);
            ++a;
        }


        // print from 10 - 100 with a line in between and stop
         int x = 10;
        while (x <= 20){
            System.out.print("\n " + x);
            System.out.print("\n ---");
            ++x;
        }
    }
   
}