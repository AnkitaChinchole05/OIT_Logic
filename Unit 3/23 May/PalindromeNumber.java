import java.util.Scanner;

public class PalindromeNumber {

    static boolean Palindrome(int num){
        int pal=0;
        int n=num;
        while(n>0){
            int digit=n%10;
            pal=pal*10+digit;
            n/=10;
        }
        if(pal==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        boolean pal=Palindrome(num);
        if(pal){
            System.out.println("Palindrome number:"+num);
        }else{
            System.out.println("Not palendrome number:"+num);
        }
    }
}
