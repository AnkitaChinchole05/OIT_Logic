import java.util.*;
class PerimeterOfSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of square:");
        int a=sc.nextInt();
        
        System.out.println("Perimeter of Square: "+(4*a));
        System.out.println("Area of Square: "+(a*a));
    }
}