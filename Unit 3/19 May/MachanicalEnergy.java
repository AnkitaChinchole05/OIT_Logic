import java.util.Scanner;

public class MachanicalEnergy {
    static double calMachanicalEnergy(double m,double h,double v){
        return m*9.8*h+0.5*m*v*v;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mass: ");
        Double m=sc.nextDouble();
        System.out.print("Enter height: ");
        Double h=sc.nextDouble();
        System.out.print("Enter velocity: ");
        Double v=sc.nextDouble();
        double result=calMachanicalEnergy(m,h,v);
        System.out.println("Machanical Energy :"+result);

    }
}
