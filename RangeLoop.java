
package rangeloop;

import java.util.Scanner;


public class RangeLoop {

   
    public static void main(String[] args) {
//Range Loop
//Write a software that will ask a user to give it a starting value and the end point value, 
//then it will print all the numbers in between those two given numbers.


        Scanner getInput = new Scanner(System.in);
        
        int min,max,num=0;
        
        System.out.println("Please enter the starting number: ");
        min = getInput.nextInt();
        System.out.println("Please enter the end number: ");
        max = getInput.nextInt();
        
        while(num<max){
            if (num > min && num < max){
            System.out.println( num);
            }
            num++;
           
        }

  
    }
}