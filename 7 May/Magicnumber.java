import java.util.Scanner;

public class Magicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num/=10;
        }
        int sum2=0;
        while(sum>0){
          int digit1=sum%10;
            sum2+=digit1;
            sum/=10;
        }
        if(sum2==1){
        System.out.println(n+" is Magic number");
        }else{
            System.out.println(n+" is not magic number");
        }
    }
}
