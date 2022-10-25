
package exam;

import java.util.Scanner;


public class Exam {

  
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        String idNo, century;
        int gender;
        
        System.out.println("Please enter your ID Number :");
        idNo = getInput.next();
        System.out.println("Please enter the century you were born at:");
        century = getInput.next();
        System.out.println("Year :" + century.substring(0,2)+ idNo.substring(0, 2));
        
        
        if("01".equals(idNo.substring(2, 4)))
            System.out.println("Month : January");
        if("02".equals(idNo.substring(2, 4)))
            System.out.println("Month : February");
        if("03".equals(idNo.substring(2, 4)))
            System.out.println("Month : March");
        if("04".equals(idNo.substring(2, 4)))
            System.out.println("Month : April");
        if("05".equals(idNo.substring(2, 4)))
            System.out.println("Month : May");
        if("06".equals(idNo.substring(2, 4)))
            System.out.println("Month : June");
        if("07".equals(idNo.substring(2, 4)))
            System.out.println("Month : July");
        if("08".equals(idNo.substring(2, 4)))
            System.out.println("Month : August");
        if("09".equals(idNo.substring(2, 4)))
            System.out.println("Month : September");
        if("10".equals(idNo.substring(2, 4)))
            System.out.println("Month : October");
        if("11".equals(idNo.substring(2, 4)))
            System.out.println("Month : November");
        if("12".equals(idNo.substring(2, 4)))
            System.out.println("Month : December");
        
        System.out.println("Date :" + idNo.substring(4,6));
        
        gender = idNo.charAt(6);
        
        if (gender >= 4)
            System.out.println("Gender : Male");
        if (gender <= 4)
            System.out.println("Gender : Female");
        if ("0".equals(idNo.substring(10,11)))
            System.out.println("Nationality : South Africa");
        if ("1".equals(idNo.substring(10,11)))
            System.out.println("Nationality : Permanent resident");
        
        
    }
    
}
