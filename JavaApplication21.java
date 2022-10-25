
package javaapplication21;

import java.util.Scanner;

public class JavaApplication21 {

    
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int x=0 ,y=20;
        
        even(x,y);
        odd(x,y);
        
        
    }
    public static void odd(int x,int y){
        while(x<=y){
            if (x % 2 != 0 && x !=0){
                System.out.println(x);
                
            }
          
            x++;
        }
    }
    public static void even(int x,int y){
         while(x<=y ){
            if (x !=0){
            System.out.println(x);
         
            }
               x= x +2;
        }
        
    }
    
}
