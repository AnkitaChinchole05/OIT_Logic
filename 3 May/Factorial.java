import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        int i=a;
        int fact=1;
        while(i>=1){
            System.out.println(i);
            fact*=i;
            i--;
        }
        System.out.println("Factorial:"+fact);
    }
}