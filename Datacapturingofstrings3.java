
package datacapturingofstrings;
import java.util.Scanner;

public class Datacapturingofstrings {

    
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        String email,initials,fullnames;
        int cellNumber;
        
        System.out.println("-------------------------------------------------"  );
        System.out.println(" PERSONAL DETAILS"  );
        System.out.println("_______________________________________________"  );
        
        System.out.print(" fullnames | " );
        fullnames = getInput.next();
        
        System.out.print(" email     | "  );
        email = getInput.next();
        
        System.out.print(" initials  | " );
        initials = getInput.next();
       
        System.out.print(" cellNumber| " );
        cellNumber = getInput.nextInt();
        System.out.println("_______________________________________________"  );
        
        
           
        
        
        
        
        
    }
    
}
