import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
       for(int i=1;i<=num;i++){
        int a=i;
      
        int sum=0;
        do{
            int digit=i%10;
           int fact=1;
           while(digit>=1){
            fact*=digit;
            digit--;
           }
           sum+=fact;
            i/=10;
        }while(i>0);
        i++;
        i=a;
        if(a==sum){
            System.out.print(sum+" ");
        }
    }
    }
}
