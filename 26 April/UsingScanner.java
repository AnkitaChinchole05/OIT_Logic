import java.util.*;

class UsingScanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Area of Sphere:");
        Double Radius=sc.nextDouble();
        Double Vol_of_Sphere= 1.33 * 3.14 * Radius * Radius * Radius;
        System.out.println("Area of sphere:"+Vol_of_Sphere);
    }
}