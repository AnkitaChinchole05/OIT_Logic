import java.util.Scanner;

class Usingcharater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter charater:");
        char ch=sc.next().charAt(0);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int start=(int)ch;
        int end=start+n;
        while(start<end){
            System.out.println((char)start);
            start++;
        }
    }
}