import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int a=num;
        int arm=0;

        while(num>0){
            int digit=num%10;
            arm=arm+((int)Math.pow(digit, 3));
            num/=10;
        }
        if(a==arm){
            System.out.println("Armstrong number: "+arm);
        }else{
            System.out.println("Not armstrong number: "+arm);
        }
       
    }
}
