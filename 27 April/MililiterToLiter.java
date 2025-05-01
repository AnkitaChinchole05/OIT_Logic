import java.util.*;
class MililiterToLiter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many Mililiter:");
        int Mililiter=sc.nextInt();
        float liter=(Mililiter/1000);
        System.out.println("MiliLiter to liter conversion:"+liter+" liters");
    }
}