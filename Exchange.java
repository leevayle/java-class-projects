
package myfirstapp;

// Swapping vars includes introducing a temporal varriable
public class Exchange {
    
    public static void main(String[] args){
//        int a= 1234;
        int b= 99;
//        int t = a;
//        int b= t;
        
        System.out.print(b++);      //postfix increment uses int as it is before incrementing it
        System.out.print(++b);      //prefix increment increment before using the int
        
        int x,y,z;
        x = 15;
        y = (x++)+28-(++x);
        z = x-- + y++ -9;
        System.out.print(--z + --y + --x);
        System.out.print(x);
        System.out.print(y);
        System.out.print(z);
        
        
        y=x<99?18:0;
        System.out.print(y);
        
        
    }
    
}
