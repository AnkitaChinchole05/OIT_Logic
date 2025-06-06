import java.util.Scanner;

public class Maxinum {
     static int Maxinum(int a,int b){
       
        
        if(a > b)
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

       
        
        System.out.println("Maximun :"+Maxinum(num1, num2));
        
    }
}
