import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter x:");
        int x=sc.nextInt();
       
        double sum=0;
        for(int i=1;i<=n;i++){
             int fact=1;
           int m=i;
           while(m>=1){
                fact*=m;
                m--;
           }
            double value=fact/Math.pow(x,i);
            sum+=value;
        }
        System.out.println(String.format("Sum: %.4f", sum));
    }
}

