import java.util.Scanner;

public class PointNumberSeries {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        Double num=sc.nextDouble();

        double sum=0;
        for(double i=1.1;i<=num;i++){
          
          
           sum+=i;
        }
        System.out.println("Sum of  Number: "+sum);
    }
}
