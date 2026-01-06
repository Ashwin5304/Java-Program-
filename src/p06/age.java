Sixth Program  
package ValidateAge; 
import java.util.Scanner; 
 
class InvalidAgeException extends Exception { 
 InvalidAgeException(String msg) { 
     super(msg); 
 } 
} 
 
public class ValidateAge { 
 static void validateAge(int age) throws InvalidAgeException { 
 
     if (age < 0) { 
         throw new InvalidAgeException("Age cannot be negative. Age must be greater than 
0."); 
     } 
     else if (age < 18) { 
         throw new InvalidAgeException("Not eligible. Age must be 18 or above." ); 
     } 
     else { 
         System.out.println("Eligible"); 
     } 
 } 
 
 
 
 
 static int divideNumbers(int num1, int num2) { 
     if (num2 == 0) { 
         throw new ArithmeticException("Cannot divide by zero"); 
     } 
     return num1 / num2; 
 } 
 
  
 public static void main(String[] args) { 
     Scanner sc = new Scanner(System.in); 
 
     while (true) { 
         System.out.println("\n----- MENU -----"); 
         System.out.println("1. Validate Age"); 
         System.out.println("2. Divide Two Numbers"); 
         System.out.println("3. Exit"); 
         System.out.print("Enter your choice: "); 
 
         int choice = sc.nextInt(); 
 
         try { 
             switch (choice) { 
 
                 case 1: 
                     System.out.print("Enter age: "); 
                     int age = sc.nextInt(); 
                     validateAge(age); 
                     break; 
 
                 case 2: 
                     System.out.print("Enter first number: "); 
                     int n1 = sc.nextInt(); 
                     System.out.print("Enter second number: "); 
                     int n2 = sc.nextInt(); 
                     int result = divideNumbers(n1, n2); 
                     System.out.println("Division result: " + result); 
                     break; 
 
                 case 3: 
                     System.out.println("Program terminated"); 
                     sc.close(); 
                     return; 
 
                 default: 
                     System.out.println("Invalid choice"); 
             } 
         } 
         catch (InvalidAgeException e) { 
             System.out.println("Custom Exception: " + e.getMessage()); 
         } 
         catch (ArithmeticException e) { 
             System.out.println("Predefined Exception: " + e.getMessage()); 
         } 
     } 
 } 
} 
 
