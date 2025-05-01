import java.util.*;
class Velocity{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial velocity:");
        Double u=sc.nextDouble();
    
        System.out.print("Enter Acceleration:");
        Double a=sc.nextDouble();
    
        System.out.print("Enter distance convered:");
        Double s=sc.nextDouble();

        Double v=Math.sqrt(u*u+2*a*s);
        System.out.println("Final velocity:"+v);
    }
}