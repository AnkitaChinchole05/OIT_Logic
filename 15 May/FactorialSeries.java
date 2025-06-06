import java.util.Scanner;

public class FactorialSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int sum=0;
         for(int i=1;i<=n;i++){
          int fact=1;
           int m=i;
           while(m>=1){
                fact*=m;
                m--;
           }
           
            sum+=fact;
    }

        
        System.out.println("Sum of factorial: "+sum);
    }
}
