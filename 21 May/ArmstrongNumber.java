import java.util.*;


public class ArmstrongNumber {
    public static void main(String[] args) {
       
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        
        
        for(int i=1;i<=num;i++){
            int temp=i;
            int c=0;
            while(i>0){
                i/=10;;
                c++;
            }
            i++;
            i=temp;
            int sum=0;
            do{
                int digit=i%10;
                sum=sum+(int)Math.pow(digit, c);
                i/=10;
            }while(i>0);
            i++;
            i=temp;
            if(sum==temp){
                System.out.print(temp+" ");
            }
        }
        }
}
