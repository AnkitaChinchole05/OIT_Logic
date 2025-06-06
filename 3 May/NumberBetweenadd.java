import java.util.Scanner;

public class NumberBetweenadd {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start number:");
        int a=sc.nextInt();
        System.out.print("Enter the end number:");
        int b=sc.nextInt();
          int sum=0;
        int i=a;
        while(i<=b){
           sum+=i;
            //System.out.println(i);
           
            i++;
        }
        System.out.println("sum:"+ sum);
    }
}
