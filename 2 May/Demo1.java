import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.print("Enter number:");
        int n=sc.nextInt();

        while(i<=n){
           if(i%2==0)
            System.out.print(i+",");
           
          
            i++;
           
        }
        System.out.println("\b");
    }
    
}
