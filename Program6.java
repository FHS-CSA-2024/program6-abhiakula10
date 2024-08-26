import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        final double pi = 3.14;
        double radius = 0;
        System.out.println("Enter The New Radius: ");
        Scanner radScanner = new Scanner(System.in); 
        radius = radScanner.nextDouble() ;
        double diameter = 2*radius;
        double area = pi * radius * radius;
        double circumference = pi * diameter;
        System.out.println("The Diameter Of The Circle Is: " + diameter );
        System.out.println("The Area Of The Circle Is: " + Math.round(1000 *area) / 1000.0 );
        System.out.println("The Circumference Of The Circle Is: " + Math.round(1000*circumference)/1000.0);
        
        
        
    }
    
    
    
    
}
