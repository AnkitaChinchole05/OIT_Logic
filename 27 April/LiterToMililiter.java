import java.util.*;
class LiterToMililiter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many liter:");
        int liter=sc.nextInt();
        int mililiter=liter*1000;
        System.out.println("Liter to mililiter conversion:"+mililiter+" mililiters");
    }
}