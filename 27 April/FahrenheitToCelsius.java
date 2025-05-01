import java.util.*;
class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenheit:");
        Double Fahrenheit=sc.nextDouble();

        Double celsius=(Fahrenheit-32)*5.0/9.0;
        System.out.println("Temperature in celsius: "+celsius);
    }
}