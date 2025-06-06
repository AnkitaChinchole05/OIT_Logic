import java.util.Scanner;

public class FahrenheitToCelsius {
    static double Conversion(double f){
        return (f-32)/1.8;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenheit :");
        Double f=sc.nextDouble();
        double cel=Conversion(f);
        System.out.println("Celsius:"+cel);
    }
}
