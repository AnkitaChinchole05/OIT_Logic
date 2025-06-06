import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            int n=i;
        int sum=0;
        while(i>9){
            int digit=i%10;
            sum=sum+digit;
            i/=10;
        }
        i++;
        int sum2=0;
        i=n;
        do{
          int digit1=sum%10;
            sum2+=digit1;
            
            sum/=10;
        }while(sum>0);
        i++;
        n=i;
        if(sum2==1){
        System.out.println(n+" ");
        }
        }
    }
}
