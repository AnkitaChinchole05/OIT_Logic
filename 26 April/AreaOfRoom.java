import java.util.*;
class AreaOfRoom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the cuboid and room:");
        System.out.print("Enter l: ");
        Double l=sc.nextDouble();
        System.out.print("Enter b: ");
        Double b=sc.nextDouble();
        System.out.print("Enter h: ");
        Double h=sc.nextDouble();
        System.out.println("Enter the dimensions of the door: ");
        System.out.print("Enter l:");
        Double dl=sc.nextDouble();
        System.out.print("Enter b: ");
        Double db=sc.nextDouble();
        System.out.println("Enter the dimensions od the Window: ");
        System.out.print("Enter l: ");
        Double wl=sc.nextDouble();
        System.out.print("Enter b: ");
        Double wb=sc.nextDouble();

        Double cuboid=2*(l*b+b*h+h*l);
        Double door=dl*db;
        Double Window=wl*wb;
        Double room=cuboid-door-Window;
        System.out.println("The area of the room is:"+room+"sq.m");

    }
}