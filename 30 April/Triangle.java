import java.util.*;
class Triangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();

        if(a>0 && b>0 &&c>0){
            //------------------------
            if(a==b &&b==c){
                System.out.println("It is equilateral triangle");
            }else if(a==b ||b==c||c==a){
                System.out.println("It is isoscales Triangle");
            }else if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b){
                System.out.println("It is right angle Triangle");
            }else{
                System.out.println("It is a scalene triangle");
            }
        }else{
            System.out.println("It is not triangle");
        }
    }
}