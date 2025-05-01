import java.util.*;
class Nem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        Double S=(a+b+c)/2.0;
        System.out.println("Semi-perimeter is:"+S);
        Double Area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area :"+Area);
    }
}