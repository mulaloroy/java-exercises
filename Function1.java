
package function1;


public class Function1 {

    public static void main(String[] args) {
     // Write a program that perform maths operation of two given numbers to find the sum, product, division and difference.
     //All the operations must happen on their own function. The two numbers must be passed as parameters to each function.
     
     product(5,5);
     division(5,5);
     sum(5,5);
     difference(5,0);
    }
    public static void sum(int x, int y) {
       
        int sum = x+y; 
        System.out.println(sum);
    }
    public static void product(int x, int y) {
       
        int product = x*y;
        System.out.println(product);
    }
    public static void division(int x, int y) {
        
        double division = x/y;
        System.out.println(division);
    }
    public static void difference(int x, int y) {
        
        int difference = x - y;
        System.out.println(difference);
    }
}
