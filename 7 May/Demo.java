import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        int num=n;
        int sum=0;
        while(num>0){
            int digit=num%10;
            System.out.println("digit:"+digit);
            int fact=1;
            while(digit>=1){
                fact*=digit;
                digit--;

            }
            sum+=fact;
            num/=10;
        }
        if(n==sum){
            System.out.println(n+ " is Krishnamurthy number");
        }else{
             System.out.println(n+ " not is Krishnamurthy number");
        }
    }
}