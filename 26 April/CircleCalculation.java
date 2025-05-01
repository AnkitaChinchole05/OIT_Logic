import java.util.*;
class CircleCalculation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        Double r=sc.nextDouble();
        Double A=3.14*r*r;
        Double C=2*3.14*r;
        System.out.println("Area of circle:"+A);
        System.out.println("circumference of circle:"+C);

    }
}