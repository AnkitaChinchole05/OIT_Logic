import java.util.*;
class SurfaceOfCylinder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of Cylinder:");
        Double r=sc.nextDouble();
         System.out.print("Enter height of Cylinder:");
        Double h=sc.nextDouble();

        Double  a=2*3.14*r*h+2*3.14*r*r;
        System.out.println("Surface area of cylinder:"+a);
    }
}