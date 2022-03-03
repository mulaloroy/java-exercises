
package highestloop;

import java.util.Scanner;

public class HighestLoop {

    public static void main(String[] args) {
         Scanner getValues = new Scanner(System.in);
         
        
         
         int i = 0 ,number, highest=0;
         
         while(i <5){
             System.out.println(" Please enter number between 0 and 20 :");
             number = getValues.nextInt();
             
             //Comparison 
             if (number > highest ){
                 highest = number;
             }
             i++;
             
         }
         System.out.println("My highest number is :" + highest);
         
         
         
    }
    
    
}
