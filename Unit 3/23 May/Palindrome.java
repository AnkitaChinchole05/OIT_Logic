import java.util.Scanner;

class Palindrome{
    static int pal(int num){
         int a=num;
        int pal=0;

        while(num>0){
            int digit=num%10;
            pal=pal*10+(digit);
            num/=10;
        }
        return pal;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int pal=pal(num);
        if(num==pal){
            System.out.println(pal+" is palindrome number");
        }else{
            System.out.println(pal+" is not palindrome number");
        }
    }
}