import java.util.*;
public class Minimum {
     static int Mininum(int a,int b){
       
        
        if(a < b)
            return a;
            else{
                return b;
            }
        
        
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int num1=sc.nextInt();
        System.out.print("Enter b:");
        int num2=sc.nextInt();

       
        
        System.out.println("Minimun :"+Mininum(num1, num2));
        
    }
}
