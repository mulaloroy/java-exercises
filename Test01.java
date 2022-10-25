
package test01;

import java.util.Scanner;


public class Test01 {

    
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
         int average, i=0, sum = 0,num,min = 0 , max =0;
         
         System.out.println("Please enter number");
         do{
             num = getInput.nextInt();
             sum += num;
             i++;
         } while(i<5);
         average = sum/5;
         
         {
             if (num>max){
                 max = num;
             
                    if (num<min){
                        min = num;
                    }
             }
             
             System.out.println("Average = "+ average);
             System.out.println("Sum = " + sum);
             System.out.println("Maximum = " + max);
             System.out.println("Minimum = " + min);
         }
        
       /*
        
        int numArray[] = {num1,num2,num3,num4,num5};
            System.out.println(numArray[2]);
            
        if ( num1> num2)
            
        
      
        total = num1+num2+num3+num4+num5;
        System.out.println("Total is " + total);
        ave= total/5;
        System.out.println("Average is " + ave);*/
        /*int i= 0,num; 
        while (i<5){
            
            System.out.println("Please Enter 5 numberes");
             num = getInput.nextInt();
             
             if (num>max){
               max=num;
                 
             }
             if (num>0)
                if (num<min){
                  min=num;
                 
             }
             
             
            i++;
             //System.out.println(max);
             

        }
      
         System.out.println("Maximum number is"+max);
         System.out.println("Minimum number is" + min);
    }*/
        
        
        
       
    }
}
