import java.util.*;
class CalculateAge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Age:");
        int Age=sc.nextInt();
        int Age_in_year=Age*365;
        System.out.println("Your Age is:"+Age_in_year);
    }
}