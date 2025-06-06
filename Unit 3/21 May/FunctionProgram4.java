import java.util.Scanner;

public class FunctionProgram4 {
    static int getLCM(int a,int b){
        int GCD=0;
        int i=1;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                GCD=i;
            }
            i++;
        }
        System.out.println("GCD: "+GCD);
        return a*b/GCD;
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        System.out.print("Enter number:");
        int b=sc.nextInt();
        double LCM=getLCM(a, b);
        
        System.out.println("LCM :"+LCM);
        
}
}