import java.util.Scanner;

class SumOfConsecutive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int n=num;
        int count=1;
        int sum=0;

        while(num>0){
          
          num=num/10;
          count++;
        }
        num=n;
            for(int i=1;i<count;i++){
                int a=num%10;
                num/=10;
                int b=num%10;
                sum+=a*b;
            }
        System.out.println("sum of consecutive product num:"+sum);
    }
}