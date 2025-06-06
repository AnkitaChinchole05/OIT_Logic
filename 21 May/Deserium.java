import java.util.Scanner;

class Deserium{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int power=0;
            int num=i;
        while(i>0){
            i/=10;
            power++;

        }
        i++;
        int sum=0;
        i=num;
        do{
            int digit=i%10;
            sum=sum+(int)Math.pow(digit, power--);
            i/=10;

        }while(i>0);
        i++;
            i=num;
            if(sum==num){
                System.out.print(num+" ");
            }
        }
    }   
}