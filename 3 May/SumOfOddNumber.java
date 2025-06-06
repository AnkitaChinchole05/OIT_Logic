import java.util.Scanner;

public class SumOfOddNumber {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
         int sum=0;
         int i=1;
        while(i<=a){

            System.out.println(i);
            if(i%2!=0)
            sum+=i;
            i++;
        }
        System.out.println("sum:"+sum);
    }
}
