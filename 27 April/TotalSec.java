import java.util.*;
class TotalSec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Hrs:");
        int hrs=sc.nextInt();
            
        System.out.print("Enter min:");
        int min=sc.nextInt();
            
        System.out.print("Enter sec:");
        int sec=sc.nextInt();

        int TotalSecond=(hrs*3600)+(min*60)+sec;
        System.out.println("Total Seconds: "+TotalSecond+" sec");
            }
}