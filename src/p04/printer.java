package p04; 
import java.util.Scanner; 
 
abstract class Printer { 
    abstract void configuration(); 
    abstract void display(); 
} 
 
class DotMatrix extends Printer { 
    public void configuration() { 
        System.out.println("Dot-Matrix: 250 cps, 180 dpi"); 
    } 
    public void display() { 
        System.out.println("Dot-Matrix Printer: Good for multi-copy printing."); 
    } 
} 
 
class LaserJet extends Printer { 
    public void configuration() { 
        System.out.println("LaserJet: 35 ppm, 1200 dpi"); 
    } 
    public void display() { 
        System.out.println("LaserJet Printer: Fast and high quality."); 
    } 
} 
 
public class PrinterDemo { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Printer p; 
     
 
        int choice;
		do {
			System.out.println("Press 1 to Display and Configuration of DotMatrix");
			System.out.println("Press 2 to Display and Configuration of LaserJet");
			System.out.println("Press 3 to Exit ");
			
		 choice = sc.nextInt();
			switch(choice) {
				
				case 1:
					p = new DotMatrix();
					p.display();
					p.configuration();
					break;
						
				case 2:
					p = new LaserJet();
					p.display();
					p.configuration();
					break;
					
				case 3:
					System.out.println("Thanks you. Exiting...");
			}
		} while (choice != 3);
		
		sc.close();
	}		
}
