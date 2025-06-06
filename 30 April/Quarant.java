import java.util.Scanner;

public class Quarant {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x:");
        int x=sc.nextInt();
        System.out.print("Enter y:");
        int y=sc.nextInt();
        
        if(x>0 && y>0){
            System.out.println("The First Quadrant variable:"+x+" "+y);
        }else if(x<0 && y>0){
            System.out.println("The second Quadrant variable:"+x+" "+y);
        }else if(x<0 && y<0){
            System.out.println("The Third Quadrant variable:"+x+" "+y);
        }else if(x>0 && y<0){
            System.out.println("The Fourth Quadrant variable:"+x+" "+y);
        }else{
            System.out.println("invalid variable quadrat:"+x+" "+y);
        }
     }
}
