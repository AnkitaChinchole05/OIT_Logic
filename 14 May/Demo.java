import java.util.Scanner;
public class Demo {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter your character: ");
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Character is vowel");
        }else{
            System.out.println("Character is not vowel");
        }
    }
}
