
package exam2;

import java.util.Scanner;


public class Exam2 {

    public static void main(String[] args) {
    Scanner getInput = new Scanner(System.in);
    
   
      
      int[] num = new int[5];
       
    
      System.out.print("Enter any 5 digit number: " ); 
        //storing values
        
      for(int i = 0;i<num.length;i++){
          
          num[i] = getInput.nextInt();
    }
      //accessing the array
        for (int i = 0; i< num.length;i++){

            
        }
        //final answer
        System.out.println("First number :" + num[0]);
            System.out.println("second number:" + num[1]);
            System.out.println("Third number :" + num[2]);
            System.out.println("forth number :" + num[3]);
            System.out.println("Firth number :" + num[4]);
 }
}