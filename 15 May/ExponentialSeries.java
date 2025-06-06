import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter x:");
        int x=sc.nextInt();
       
        double sum=0;

        for(int i=0;i<=n;i++){
            int m=i;
            int fact=1;
            if(m==0){
                fact=1;
            }else{
                while(m>=1){
                    fact*=m;
                    m--;

                }
            }
            double value=Math.pow(x,i)/fact;
            sum+=value;
        }
        System.out.println(String.format("Result: %.2f", sum));
    }
}
