import java.util.*;
class AreaOfCyl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        Double radius=sc.nextDouble();
        System.out.print("Enter height:");
        Double height=sc.nextDouble();
        Double Vol_of_cy=3.14*radius*radius*height;
        System.out.println("Area of the culinder:"+Vol_of_cy);
}
}