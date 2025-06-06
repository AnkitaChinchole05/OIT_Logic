import java.util.Scanner;

public class CelsiusToFahrenheit {
    static double Conversion(double c){
        return ((1.8*c)+32);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Celsius :");
        Double c=sc.nextDouble();
        double result=Conversion(c);
        System.out.println("Fahrenheit:"+result);
    }
}
