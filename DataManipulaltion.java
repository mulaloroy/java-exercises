
package datamanipulaltion;
import java.util.Scanner;
public class DataManipulaltion {

   
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        double bread, milk, eggs,vat,total,paid,change;
        
        System.out.println("-----------------------------");
        System.out.println("-------WELCOME---------------");
        
        System.out.print("Bread :  R");
           bread = getInput.nextDouble();
        System.out.print("Milk :  R");
           milk = getInput.nextDouble();
        System.out.print("Eggs :  R");
           eggs = getInput.nextDouble();
        System.out.print("Amount Paid:  R");
           paid = getInput.nextDouble();
        
        System.out.println("-----------------------------");
           
        total = bread + milk + eggs ;      
        System.out.println( "The total amount is " + total);
        
        System.out.println("-----------------------------");
        vat = total* 0.15;
        System.out.println("VAT at 15%:R" + vat );
        System.out.println("-----------------------------");
        
        System.out.println( "TOTAL    :R"+ total);
     
        System.out.println( "PAID     :R"+ paid);
        
        System.out.println("-----------------------------");
        change = paid-total;
        System.out.println( "Change:  R"+ change);
        
        System.out.println("=============================");
        
    }
    
}
