
package javaapplication1;

import java.util.Scanner;


public class BankSwitch {
     public static void main(String[] args) {
        Scanner getValues = new Scanner(System.in);
        int accNo, pin;
        char option;
        
        
         System.out.println("=========================================");
         System.out.println("-----------WELCOM TO MY BANK-------------");
          
        //Acount number
         System.out.print("Enter Account Number: ");
         accNo = getValues.nextInt();
         //pin
         System.out.print("Enter Pin Number: ");
         pin = getValues.nextInt();
         System.out.println("=========================================");
         
         
         //options
         System.out.println("D-For Deposit: ");
         System.out.println("W-For Withdrawal ");
         System.out.println("B-For Balance: ");
         System.out.println("C-Cancel: ");
         System.out.println("-----------------------------------------");
         
         //OTIONS
         System.out.print("Select your option: ");
         option = getValues.next().charAt(0);
         System.out.println("-----------------------------------------");
         
         switch(option) {
                case 'D':
                   System.out.println("Prepare your money");
                      break;
                case 'W':
                   System.out.println("Still updating");
                     break;
                case 'B':
                   System.out.println("Your Balance is: R4560.20");
                     break;
                case 'C':
                    System.out.println("Thank for using the ATM");
                     break;
           
                     
         
         }
         System.out.println("-----------------------------------------");
         System.out.println("Thank you");
         
         
         
         
         
         
     }
    
}
