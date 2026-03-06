package calci;
import java.util.Scanner;

class Calc {

    static int num1, num2;   
    private int a, b;        

    Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int Add() { 
    	return a + b; 
    	}
    int Sub() 
    { 
    	return a - b; 
    }
    int Mul() 
    { 
    	return a * b; 
    	}

    double Div() {
        if (b == 0) {
            System.out.println("Error: Can't divide by 0");
            return 0;
        }
        return a / b;   
    }
}

public class calci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter number 1: ");
            Calc.num1 = sc.nextInt();

            System.out.print("Enter number 2: ");
            Calc.num2 = sc.nextInt();

            Calc cal = new Calc(Calc.num1, Calc.num2);

            System.out.print("\n1.Add 2.Sub 3.Mul 4.Div 5.Exit \nChoice: ");
            int ch = sc.nextInt();

            

            switch (ch) {
                case 1: System.out.println("Result: " + cal.Add()); 
                break;
                case 2: System.out.println("Result: " + cal.Sub()); 
                break;
                case 3: System.out.println("Result: " + cal.Mul()); 
                break;
                case 4: System.out.println("Result: " + cal.Div()); 
                break;
                case 5:
                	System.out.println("EXIT");
                	return;
                	
                default: System.out.println("Invalid choice");
            }
        }
    }
}
