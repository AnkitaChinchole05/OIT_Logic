import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter x:");
        int x=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int value=(int)(Math.pow(i, x));
            sum+=value;
        }
        System.out.println("sum :"+sum);
    }
}
