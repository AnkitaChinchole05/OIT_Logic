import java.util.Scanner;

public class Triangleseries {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
       
        double sum=0;

        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
            }
            System.out.println(count);
            sum += count;
        }
        
        
        System.out.println(String.format("Result: %.4f", sum));
    }
}
