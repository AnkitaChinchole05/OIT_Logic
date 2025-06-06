import java.util.Scanner;

public class CubeNumberSum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int sum=0;
        for(int i=1;i<=num;i++){
           int value=(int)Math.pow(i,3);
          
           sum+=value;
        }
        System.out.println("Sum of cube Number: "+sum);
    }
}
