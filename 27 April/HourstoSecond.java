import java.util.*;
class HourstoSecond{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Hours:");
        int hours=sc.nextInt();
        int Second=hours*3600;
        System.out.println("Hours to Second conversion:"+Second+" sec");
    }
}