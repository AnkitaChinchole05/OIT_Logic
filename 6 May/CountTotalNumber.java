import java.util.Scanner;

public class CountTotalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit:");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int digit=num%10;
            num/=10;
            count++;
        }
        System.out.println("Total number count:"+count);
    }
}
