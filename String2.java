
package string2;


public class String2 {

    
    public static void main(String[] args) {
        
        //Use built-in functions to compose a string that reads: "Java test is next week"
String first = "Java is next";
        String first2= first.substring(5, 12);
        first = first.substring(0, 5);
        
       
     
String second = "test";
    first = first.concat(second);
    
String third = "week";
        first2 = first2.concat(" ");
        first2 = first2.concat(third);
        System.out.println(first2);
first = first.concat(" ");
System.out.println(first);

String lastString = first.concat(first2);
        System.out.println(lastString);




    }
    
}
