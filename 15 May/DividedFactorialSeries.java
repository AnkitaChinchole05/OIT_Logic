import java.util.Scanner;

public class DividedFactorialSeries {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        double sum=0;
        
        for(int i=1;i<=n;i++){
            int fact=1;
            int m=i;

           while(m>=1){
           
            fact*=m;
            m--;
        }
        System.out.println(fact+" ");
        double value=fact/i;
        sum+=value;
    }
        System.out.println(String.format("result: %.2f", sum));


    }
}
