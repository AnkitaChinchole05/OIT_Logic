import java.util.*;
class Potential{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        Double e,p,g=9.8;

        System.out.print("Enter Mass of body:");
        int m=sc.nextInt();
        System.out.print("Enter Deplacement of body:");
        int h=sc.nextInt();
        System.out.print("Enter Velocity of body:");
        int v=sc.nextInt();
         p=m*g*h;
         System.out.println("Potential energy of body:"+p);
        float k=m*v*v/2;
         System.out.println("Kinetic Energy of body:"+k);
         
    }
}