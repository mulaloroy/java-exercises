
package datacapturing;
import java.util.Scanner;

public class Datacapturing {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
                
           String name;
           int age;
           double height;
           boolean male;
           short temp;
           
           
           System.out.print("City:  ");
           name = getInput.next();
           System.out.print("Popullation number:  ");
           age = getInput.nextInt();
           System.out.print("Area:  ");
           height = getInput.nextDouble();
           System.out.print("The city is overpopulated? true or false:  ");
           male = getInput.nextBoolean();
           System.out.print("Avarage temperature in fehrenhit:  ");
           temp = getInput.nextShort();
          
                   
           
           
           
    }
    
}
