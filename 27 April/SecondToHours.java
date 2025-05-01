import java.util.*;
class SecondToHours{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Second:");
        int second=sc.nextInt();
        int hours=(second/3600);
        int min=(second%3600)/60;
        int sec=((second%3600)%60);
        System.out.println("Second To Hours conversion:"+hours+":"+min+":"+sec+" hrs");
    }
}