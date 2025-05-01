import java.util.*;
class AsciiVallue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        char a=sc.next().charAt(0);
        int ascii=(int)a;
        System.out.println("The ASCII Value of "+a+" is:"+ascii);
    }
}