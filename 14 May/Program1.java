import java.util.*;
class Program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice:");
        char ch=sc.next().charAt(0);

        if(Character.isLowerCase(ch)){
            System.out.println(ch+" is lower case");
        }else if(Character.isUpperCase(ch)){
            System.out.println(ch+" is Upper Case");
        }else if(Character.isDigit(ch)){
            System.out.println(ch+" id digit");
        }else{
            System.out.println(ch+" is special character");
        }
    }
}