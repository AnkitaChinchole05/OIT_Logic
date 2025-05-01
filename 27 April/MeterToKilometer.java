import java.util.*;
class MeterToKilometer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter meters:");
        int meter=sc.nextInt();
        float kilometer=(meter/1000);
        System.out.println("meter to kilometers conversion:"+kilometer+" kilometers");
    }
}