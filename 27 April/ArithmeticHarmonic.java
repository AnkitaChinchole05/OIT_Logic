import java.util.*;
class ArithmeticHarmonic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1:");
        int num1=sc.nextInt();
        System.out.print("Enter the number2:");
        int num2=sc.nextInt();
        System.out.print("Enter the number3:");
        int num3=sc.nextInt();
        System.out.print("Enter the number4:");
        int num4=sc.nextInt();

        int AM=(num1+num2+num3+num4)/4;
        
        int HM= 4/(1/num1)+(1/num2)+(1/num3)+(1/num4) ;       
        System.out.println("Arithmetic Mean:"+AM);
        System.out.println("Harmonic Mean:"+HM);
    }
}