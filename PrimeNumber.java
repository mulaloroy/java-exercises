
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

  
    public static void main(String[] args) 
    {
        Scanner getInput = new Scanner(System.in);
        
         int range, primeNo2 = 2, primeNo3 = 3, primeNo5 = 5 , primeNo7 = 7;
         
       System.out.println("Please insert range:");
          range = getInput.nextInt();
          
          //Given prime numbers
          System.out.println(primeNo2);
          System.out.println(primeNo3);
          System.out.println(primeNo5);
          System.out.println(primeNo5);
          
          //Prime number loop
          for(int i = 2; i <=range; i++){
             
              
              if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i %7 !=0){
                  System.out.println(i);
              }
                      
          }
        }
    }
