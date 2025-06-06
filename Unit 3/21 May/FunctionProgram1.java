import java.util.*;
class FunctionProgram1{

    static void getLCM(){
        Scanner sc=new Scanner( System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        System.out.print("Enter number:");
        int b=sc.nextInt();
        int GCD=0;
        int i=1;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                GCD=i;
            }
            i++;
        }
        System.out.println("GCD: "+GCD);
        double LCM=a*b/GCD;

        System.out.println("LCM :"+LCM);
        
    }
   
    public static void main(String[] args) {
        getLCM();
    }
}