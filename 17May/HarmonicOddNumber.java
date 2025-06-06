import java.util.Scanner;

public class HarmonicOddNumber {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        double j=1;
        double sum=0;
        for(int i=2;i<=num;i+=2){
            
          sum+=(j/i);
          
            j+=2;
          
        }
        System.out.println("Sum of Number: "+sum);
    }
}
