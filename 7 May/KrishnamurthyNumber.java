import java.util.Scanner;

public class KrishnamurthyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            int fact=1;
            while(digit>=1){
                fact*=digit;
                digit--;
            }
            sum+=fact;
            n/=10;
        }
        if(num==sum){
            System.out.println(sum+" is krishnamurthy number");
        }else{
             System.out.println(sum+" is  not krishnamurthy number");
        }
    }
}
