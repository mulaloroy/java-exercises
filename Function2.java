
package function2;

import java.util.Scanner;


public class Function2 {

   
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
      /* Write a program that calls 4 different functions based on the user input.
        B-Balance
        C-Cancel
        D-Deposit
        W-Withdrawal
        Each function must perform fully the operation of its option.
        Current balance is R26750.50*/
      
      char letter;
      
      
        System.out.println("B-Balance");
        System.out.println("C-Cancel");
        System.out.println("D-Deposit");
        System.out.println("W-Withdrawal");
        
        System.out.println("Please enter The letter for transaction");
        letter = getInput.next().charAt(0);
   
        
        if (letter == 'B' ){
            balance() ;
        }
        else if (letter == 'C' ){
            cancel();
        }
        else if (letter == 'D' ){
            deposit() ;
        }
        else if (letter == 'W' ){
            withdrawal();        
        }
    }
    public static void balance() {
        double balance= 26750.50;
        System.out.println("Current Balance: R"+ balance);
    }
    public static void cancel() {
        System.out.println("Transaction Canceled");
    }
    public static void deposit() {
        System.out.println("Enter the amount for deposit");
    }
    public static void withdrawal() {
        System.out.println("Enter the amount for Withdrawal");
    }
    
}
