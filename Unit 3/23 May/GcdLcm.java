import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b");
        int b=sc.nextInt();
        int LCM=getLCM(a,b);
        int GCD=getGCD(18,12);
        System.out.println("GCD of 18 and 12 :"+GCD);
        System.out.println("LCM of a and b:"+LCM);
    }
    static int getLCM(int a,int b){
        return (a*b)/getGCD(a,b);
    }
    static int getGCD(int a,int b){
        if(b==0){
            return a;
        }
        return getGCD(b, a%b);
    }
}
