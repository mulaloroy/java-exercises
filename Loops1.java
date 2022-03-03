
package loops1;

import java.util.Scanner;


public class Loops1 {

    
    public static void main(String[] args) {
         Scanner getValues = new Scanner(System.in);
         
         int testMark, student = 0;
         
         
         
  
        
        while(student <5){
            
            System.out.println("What is your test mark?  ");
             testMark = getValues.nextInt();
            
             if (testMark >= 0 && testMark <=40 ){
                 System.out.println("F");
                 
             }
             if (testMark >= 51 && testMark <=59 ){
                 System.out.println("D");
                 
             }
             if (testMark >= 60 && testMark <=69 ){
                 System.out.println("C");
                 
             }
             if (testMark >= 70 && testMark <=79 ){
                 System.out.println("B");
                 
             }
             if (testMark >= 80 && testMark <=100 ){
                 System.out.println("C");
                 
             }
             student++;
         }
        
        
        
        
        
        }
         
    }
        
     
    