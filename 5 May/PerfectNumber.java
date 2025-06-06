import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<num){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
        if(num==sum){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }
    }
}
